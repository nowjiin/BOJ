import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();  // 주어질 문자열
      String ch=s.toUpperCase();  // 문자열을 모두 대문자로 바꿈
      int[] len=new int[26];   // 알파벳 갯수만큼 배열 생성

      int max=0;   // 중복된 값을 저장할 수
      int count=0;  // 가장 중복이 많은 문자가 몇개인지
      char cha='A';  // 중복이 많은 문자를 알파벳으로 출력하기 위해 선언

      for(int i=0;i<ch.length();i++) {
    	  for(int j=0;j<len.length;j++) if(ch.charAt(i)-65==j) len[j]++;  // 만약 문자가 중복이 된다면, 해당 문자의 알파벳 
                                                                          // 배열에 1씩 더한다
      }
	  for(int j=0;j<len.length;j++) max=Math.max(len[j],max);   //가장 중복이 많이 되어있는 문자열의 갯수를 가져온다.
	  for(int j=0;j<len.length;j++) if(max==len[j]) count++;    // max값과 중복값이 일치하는 문자가 있다면 count에 1을 +
	  for(int j=0;j<len.length;j++) {
		  if(max==len[j]&&count==1) System.out.println((char)(cha+j)); //max값과 같은 문자들이 1개만 있다면 해당 문자 출력
		  else if(max==len[j]&&1<count) {
			  System.out.println("?");        // 만약 max값과 같은 문자들이 여러개라면 ?를 출력
			  break;
		  }
	  }
   }
}
