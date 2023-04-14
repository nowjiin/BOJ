import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

      FastReader fr = new FastReader();
      int hour = fr.nextInt();
      int min = fr.nextInt();

      int temp = 0;
      temp = min-45;
      if(temp < 0) {
        hour = hour - 1;
        temp += 60;
        if(hour < 0)
          hour = 23;
      }
      System.out.println(hour);
      System.out.println(temp);
      
      

      
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
