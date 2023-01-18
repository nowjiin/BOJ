import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int c = fr.nextInt();
        for (int testCase = 0; testCase < c; testCase++) {
            int n = fr.nextInt(); // 학생의 수
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arrayList.add(fr.nextInt()); // 각 점수 입력
            }
            // 한 명씩 점수를 확인하여 합계 계산
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arrayList.get(i);
            }
            // 평균을 넘는 학생의 수 계산
            double average = (double) sum / n;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arrayList.get(i) > average) count++;
            }
            // 평균을 넘는 학생의 비율 계산
            double ratio = (double) count * 100 / n;
            // 소수점 아래 셋째자리까지 출력
            String answer = String.format("%.3f", ratio);
            System.out.println(answer + "%");
        }
    }
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
/*
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
      FastReader fr = new FastReader();
      
      int num = fr.nextInt();
      
      for(int i = 0 ; i < num ; i++){
        int n = fr.nextInt();
        int[] arr = new int[n];
        double sum = 0;

        for(int j = 0; j < n; j++){
          arr[j] = fr.nextInt();
          sum += arr[j];
        }
        
        double mean = (double)sum/n;
        double count = 0;
        
        for(int k = 0; k < n; k++){
          if(arr[k] > mean)
            count ++;
        }
        
        System.out.printf("%.3f%%\n", (count/n)*100);
      }
    }

    

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
*/
