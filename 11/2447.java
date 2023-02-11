import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        
        for(int i = 0; i < N; i++){
            Arrays.fill(board[i], ' ');
        }

        // 분할 정복
        divideConquer(0, 0, N);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void divideConquer(int p1, int p2, int n){
        if(n == 3){
            for(int i = p1; i < p1+3; i++){
                for(int j = p2; j < p2+3; j++){
                    if(i == p1 + 1 && j == p2 + 1){
                        continue;
                    }
                    board[i][j] = '*';
                }
            }
            return;
        }

        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                if(i == 1 && j == 1){
                    continue;
                }
                divideConquer(p1 + i*(n/3), p2 + j*(n/3), n/3);
            }
        }
    }
}
