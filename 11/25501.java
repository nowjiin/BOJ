import java.io.*;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int test = 0; test < T; test++){
            char[] s = br.readLine().toCharArray();
            cnt = 1;
            sb.append(recursion(s, 0, s.length-1) + " ");
            sb.append(cnt + "\n");
        }
        System.out.print(sb.toString());
    }

    static int recursion(char[] s, int l, int r){
        if(l >= r){
            return 1;
        }else if(s[l] != s[r]){
            return 0;
        }else{
            cnt += 1;
            return recursion(s, l+1, r-1);
        }
    }
}
