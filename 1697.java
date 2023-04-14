import java.io.*;
import java.util.*;

public class Main {

  public static int[] visited = new int[100001];
  public static int n, k;
  
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    k = scanner.nextInt();

    Queue<Integer> q = new LinkedList<>();
    visited[n] = 1;
    q.offer(n);
    while (!q.isEmpty()) {
      int current = q.poll();
      if (current - 1 >= 0) {
        if (visited[current - 1] == 0) {
          q.offer(current - 1);
          visited[current - 1] = visited[current] + 1;
        }
      }
      if (current + 1 <= 100000) {
        if (visited[current + 1] == 0) {
          q.offer(current + 1);
          visited[current + 1] = visited[current] + 1;
        }
      }
      if (current * 2 <= 100000) {
        if (visited[current * 2] == 0) {
          q.offer(current * 2);
          visited[current * 2] = visited[current] + 1;
        }
      }
    }

    System.out.println(visited[k] - 1);
  }
}
