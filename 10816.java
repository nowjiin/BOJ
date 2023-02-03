import java.io.*;
import java.util.*;
public class Main {
    public static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) end = mid;
            else start = mid + 1;
        }
        return end;
    }
    public static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) end = mid;
            else start = mid + 1;
        }
        return end;
    }
    // 값이 [left_value, right_value]인 데이터의 개수를 반환하는 함수
    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        // 유의: lowerBound와 upperBound는 end 변수의 값을 배열의 길이로 설정
        int rightIndex = upperBound(arr, rightValue, 0, arr.length);
        int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
        return rightIndex - leftIndex;
    }
  
	public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    // 전체 원소 입력받기
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    // 이진 탐색을 위한 오름차순 정렬
    Arrays.sort(arr);
        
    StringWriter stringWriter = new StringWriter();
    BufferedWriter buffWriter = new BufferedWriter(stringWriter);
        
    // 전체 쿼리 입력받기
    int m = scanner.nextInt();
    String answer = "";
    for(int i = 0; i < m; i++) {
      int query = scanner.nextInt();
      int count = countByRange(arr, query, query);
      buffWriter.write(count + " ");
    }
    buffWriter.flush();
    System.out.println(stringWriter.getBuffer());
  }
}
