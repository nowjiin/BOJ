import java.util.*;

public class Main {
	public static int [] dp = new int[1000001];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 2; i <= n; i ++){
			//현재의 수에서 1을 빼는 경우
			dp[i] = dp[i-1] + 1;

			//2로 나눠지는경우
			if(i % 2 == 0)
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			//3으로 나눠지는 경우
			if(i % 3 == 0)
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		}
		System.out.println(dp[n]);
		sc.close();
	}
}
