import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
      FastReader fr = new FastReader();
      int n = fr.nextInt();
      String[] arr = new String[n];
      
      for(int i = 0 ; i < n ; i++){
        arr[i] = fr.next();
      }
      for (int i = 0; i < arr.length; i++) {
			  int c = 0;
			  int sum = 0;
			
			  for (int j = 0; j < arr[i].length(); j++) {
				  if (arr[i].charAt(j) == 'O') {
					  c++;
          }
				  else {
				  	c = 0;
				  }
				  sum += c;
			  }
        System.out.println(sum);
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
