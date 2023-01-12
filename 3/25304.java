import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

      FastReader fr = new FastReader();
      int total = fr.nextInt();
      int num = fr.nextInt();
      int sum = 0;
      for(int i = 1; i <= num; i ++){
        int price = fr.nextInt();
        int n = fr.nextInt();

        sum += price * n;
        
      }
      if(sum == total)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      //String s = fr.nextLine();
      
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
