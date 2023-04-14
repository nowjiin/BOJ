import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

      FastReader fr = new FastReader();
      int a = fr.nextInt();
      int b = fr.nextInt();

      if(a > 0 && b > 0)
        System.out.println("1");
      else if(a < 0 && b > 0)
        System.out.println("2");
      else if(a < 0 && b < 0)
        System.out.println("3");
      else
        System.out.println("4");
      
      
      

      
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
