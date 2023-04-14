import java.io.*;
import java.util.*;

class Node {

  private int x;
  private int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
}

public class Main {

  public static int[][] visited = new int[100][100];
  public static int[][] arr = new int[100][100];
  public static int n, m;
  public static int[] dx = { 0, -1, 0, 1 };
  public static int[] dy = { 1, 0, -1, 0 };

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    m = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      String line = scanner.next();
      for (int j = 0; j < line.length(); j++) {
        int current = line.charAt(j) - '0';
        arr[i][j] = current;
      }
    }

    Queue<Node> q = new LinkedList<>();
    visited[0][0] = 1;
    q.offer(new Node(0, 0));

    while (!q.isEmpty()) {
      Node cur = q.poll();
      int x = cur.getX();
      int y = cur.getY();
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= m)
          continue;
        if (arr[nx][ny] == 0)
          continue;
        if (visited[nx][ny] != 0)
          continue;
        visited[nx][ny] = visited[x][y] + 1;
        q.offer(new Node(nx, ny));
      }
    }
    System.out.println(visited[n - 1][m - 1]);
  }
}
