import java.io.*;
import java.util.*;

public class Main {
    static int[][] board = new int[9][9];
    static ArrayList<int[]> emptyPoint = new ArrayList<>();

    static int[][] writeBoard = new int[9][9];
    static boolean isSolved = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                board[i][j] = num;
                if (num == 0) {
                    emptyPoint.add(new int[]{i, j});
                }
            }
        }
        for(int i = 0; i < 9; i++){
            writeBoard[i] = board[i].clone();
        }
        backTracking(0);
    }

    private static void backTracking(int depth) {
        if (depth == emptyPoint.size()) {
            printSdoku(writeBoard);
            isSolved = true;
            return;
        }
        
        for (int i = 1; i <= 9; i++) {
            if(isSolved){
                return;
            }
            if (isPromising(writeBoard, depth, i)) {
                int[] point = emptyPoint.get(depth);
                writeBoard[point[0]][point[1]] = i;
                backTracking(depth + 1);
                writeBoard[point[0]][point[1]] = 0;
            }
        }
    }

    private static boolean isPromising(int[][] board, int depth, int num) {
        int[] point = emptyPoint.get(depth);

        // 가로, 세로
        for (int i = 0; i < 9; i++) {
            if (board[point[0]][i] == num) {
                return false;
            }

            if (board[i][point[1]] == num) {
                return false;
            }
        }

        // 박스
        for (int i = point[0] / 3 * 3; i < point[0] / 3 * 3 + 3; i++) {
            for (int j = point[1] / 3 * 3; j < point[1] / 3 * 3 + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printSdoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
