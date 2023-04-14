import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
      FastReader fr = new FastReader();
      int n = fr.nextInt();
      int max = 0;
      double sum = 0.0;
      int[] arr = new int[n];
      
      for(int i = 0 ; i < n ; i++){
        arr[i] = fr.nextInt();
        if(arr[i] > max)
          max = arr[i];
      }
      
      for (int i=0; i < arr.length; i++) {
        sum += ((double)arr[i] /(double)max)*100;
      }

      System.out.println(sum/arr.length);

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
