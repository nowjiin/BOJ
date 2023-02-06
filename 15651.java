import java.util.*;
import java.io.*;

public class Main {
	public static boolean[] visited = new boolean[10];
  public static Stack<Integer> result = new Stack<Integer>();
  public static int N;
	public static int M;
  
  public static void dfs(int depth){
    
    if(depth == M){
      for(int x: result) System.out.print(x + " ");
      System.out.println();
      	return;
    }
    for(int i = 1; i <= N; i++){
      visited[i] = true;
      result.push(i);
      dfs(depth + 1);
      visited[i] = false;
      result.pop();
    }
  }



	public static void main(String[] args) {
		FastReader fr = new FastReader();
    N = fr.nextInt();
		M = fr.nextInt();
		dfs(0);
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
