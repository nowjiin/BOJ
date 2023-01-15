import java.util.*;
import java.io.*;
  
public class Main {
    public static void main(String[] args) {
      FastReader fr = new FastReader();
      
      boolean[] check = new boolean[30];
      int num;
      for(int i = 0; i < 28; i++){
        num = fr.nextInt()-1;
        check[num] = true;
      }
      for(int i = 0; i < 30; i++){
        if(!check[i])
          System.out.println(i+1);
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
