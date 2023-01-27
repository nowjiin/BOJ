/*
거리: 2 3 1 2
주유 비용: 5 2 4 7 8
    거리:2      거리:3     거리:1         거리:2
[5원]     [2원]        [4원]       [7원]        [8원]
=> "뒤에 있는" 자기보다 비싼 주유소를 미리 "결제"한다.
[핵심] 비오름차순 처리하기
예시 1)
주유 비용: 5 2 4 7 8
실제 주유 비용: 5 2 2 2 2
예시 2)
거리: 2 3 1 2
주유 비용: 7 5 8 4 9
실제 주유 비용: 7 5 5 4 4
답: (7 * 2) + (5 * 3) + (5 * 1) + (4 * 2)
[아이디어 핵심] 비오름차순으로 바꾸어주기
*/

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 전체 주유소의 수
    int n = scanner.nextInt();
    
    int[] distances = new int[n - 1];
    int[] costs = new int[n];
    // 전체 거리(distance) 입력받기
    for (int i = 0; i < n - 1; i++) {
      distances[i] = scanner.nextInt();
    }
    // 전체 비용(cost) 입력받기
    for (int i = 0; i < n; i++) {
      costs[i] = scanner.nextInt();
    }
    // 실제 비용은 비오름차순으로 재정의
    int[] realCosts = new int[n];
    int minValue = costs[0];
    for (int i = 0; i < n; i++) {
      if (minValue > costs[i]) minValue = costs[i];
      realCosts[i] = minValue;
    }
    // 실제 주유 비용 계산
    long result = 0;
    for (int i = 0; i < n - 1; i++) {
      result += (long) distances[i] * realCosts[i];
    }
    System.out.println(result);
  }
}
