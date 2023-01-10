import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    FastReader fr = new FastReader(); // 문제 해결 소스 코드
    int a = fr.nextInt();
    
    if(a<=100 && a>=90)
      System.out.println("A");
    else if(a<90 && a>=80)
      System.out.println("B");
    else if(a<80 && a>=70)
      System.out.println("C");
    else if(a<70 && a>=60)
      System.out.println("D");
    else
      System.out.println("F");
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
