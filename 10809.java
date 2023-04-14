import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int[] arr = new int[26];
      for(int i = 0; i < 26; i++) //배열 -1로 초기화
          arr[i] = -1;

      for(int i = 0; i < s.length(); i++) {
    	  if(arr[s.charAt(i)-97]==-1)
              arr[s.charAt(i)-97]=i; 
        // baekjoon을 넣는다면 처음 b는 arr의 2번째 자리
        // b에서 'a'를 빼면 1이 나오고 arr[1]
        // arr[1]이 -1이면 arr[1]에 i값인 2 넣음.
        // baekjoon에서 첫번째 b는 arr[1]에 2로 저장.

        // 만약 같은 문자가 나온다면 첫번째 문자만 들어가게 
        // 첫번째 문자가 들어가서 arr[s.charAt(i)-97]==-1이 false
        // 두번째 문자는 들어가지 않음
      }
      for(int i=0; i<arr.length;i++) System.out.print(arr[i]+" ");
   }
}
