import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

      FastReader fr = new FastReader();
      int a = fr.nextInt();
      int b = fr.nextInt();
      int c = fr.nextInt();

      int sum=0;
      
      if(a==b && b==c && a==c)
        sum = 10000 + a * 1000;
      else if (a != b && b != c && a != c) {
        int max;
        max = Math.max(a,b);
        max = Math.max(max,c);
        sum = max*100;
      } 
      else if(a==b || b==c || a==c){
        if(a==b)
          sum = 1000 + a * 100;
        else if(b==c)
          sum = 1000 + b * 100;
        else
          sum = 1000 + c * 100;
       }

      System.out.println(sum);

      
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
