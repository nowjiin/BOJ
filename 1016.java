import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        // 최댓값과 최솟값의 차이만큼 배열 선언
        boolean[] check = new boolean[(int) (max - min + 1)];

        // 2의 제곱수인 4부터 max보다 작거나 같은 값까지 반복
        for (long i = 2; i * i <= max; i++) {
            // 제곱수
            long pow = i * i;
            long startIndex = min % pow == 0 ? min / pow : min / pow + 1;
            //long startIndex = min / pow;
//            if (min % pow != 0) {
//                // 나머지가 있으면 1을 더해야 min보다 큰 제곱수에서 시작
//                startIndex++;
//            }
            for (long j = startIndex; pow * j <= max; j++) {
                check[(int) ((j * pow) - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < max - min + 1; i++) {
            if (!check[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
