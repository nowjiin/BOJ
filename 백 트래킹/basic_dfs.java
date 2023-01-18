import java.util.*;

public class Main {
  public static boolean[] visited = new boolean[10];
  public static Stack<Integer> result = new Stack<Integer>();
  public static int k;
  
  public static void dfs(int depth){
    
    if(depth == k){
      for(int x: result) System.out.print(x + " ");
      System.out.println();
      return;
    }
    for(int i = 0; i < 10; i++){
      if (visited[i])
        continue;
      visited[i] = true;
      result.push(i);
      dfs(depth + 1);
      visited[i] = false;
      result.pop();
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    k = scanner.nextInt();
    dfs(0);
    scanner.close();
  }
}
