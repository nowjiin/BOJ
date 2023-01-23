import java.util.*;

public class Main{
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String n = scanner.nextLine();
		String n2 = scanner.nextLine();
		        
		String[] num = n.split(" ");
		String[] num2 = n2.split(" ");
		
		int people=Integer.parseInt(num[0]);         // 첫번째 줄의 첫번째 수는 사람들의 숫자
		int rank=Integer.parseInt(num[1]);           // 첫번째 줄의 두번째 수는 커트라인 등수
		
		int[] list=new int[people];                 
		for(int i=0;i<people;i++) {
			list[i]=Integer.parseInt(num2[i]); 
		}
		Arrays.sort(list);                           // 점수를 오름차순 정렬
		System.out.println(list[people-rank]);       // n번째 사람을 출력

	}
}
