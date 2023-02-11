import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> calc = new ArrayList<>();
    static int[] opArr = new int[4];
    static int[] numArr;
    static int[] opSeq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        numArr = new int[N];
        opSeq = new int[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 4; i++) {
            opArr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, N - 1);

        calc.sort(Comparator.naturalOrder());

        System.out.println(calc.get(calc.size() - 1));
        System.out.println(calc.get(0));
    }

    private static void dfs(int depth, int opNum) {
        if (depth == opNum) {
            calc.add(calculate(depth + 1));
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (opArr[i] > 0) {
                opArr[i]--;
                opSeq[depth] = i;
                dfs(depth + 1, opNum);
                opArr[i]++;
            }
        }
    }

    private static int calculate(int n) {
        int num = numArr[0];

        for (int i = 1; i < n; i++) {
            switch (opSeq[i - 1]) {
                case 0:
                    num = num + numArr[i];
                    break;
                case 1:
                    num = num - numArr[i];
                    break;
                case 2:
                    num = num * numArr[i];
                    break;
                case 3:
                    num = num / numArr[i];
                    break;
            }
        }
        return num;
    }
}
