import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 총 회의의 갯수
        int[][] timetable = new int[N][2]; // 회의 시간 및 종료 시간 기록용

        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()); // 시작시간
            int end = Integer.parseInt(st.nextToken()); // 종료시간
            timetable[n][0] = start;
            timetable[n][1] = end;
        }

        // 끝나는 시간 기준으로 timetable을 정렬
        Comparator<int[]> byend = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) // 끝나는 시간이 같다면
                    return o1[0] - o2[0]; // 시간 시간 기준으로 정렬
                // 1) o1[0] - o2[0] 음수 => o2가 더 늦게 시작함 => 유지
                // 2) o1[0] - o2[0] 양수 => o1이 더 늦게 시작함 => 교환
                return o1[1] - o2[1]; // 같지 않다면 끝나는 시간 기준으로 정렬
            }
        };
        Arrays.sort(timetable, byend); //  재정의한 방식대로 timetable 정렬

        int cnt = 0;
        int prend = 0;

        for (int i = 0; i < N; i++) {
            // 전 회의 종료시간 <= 새로 살펴 볼 회의 시작시간 => 그 회의 시작 가능!
            // Q. 단순 가능이 아니라 최대한 많은 회의를 해야되잖아요?
            // => 이미 위에서 끝나는 시간으로 정렬을 해 두었기 때문에 가능한 것들을 뽑아가면 최대 가능 회의

            if (prend <= timetable[i][0]) {
                prend = timetable[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
