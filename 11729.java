import java.io.*;

public class Main {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		System.out.println((int)Math.pow(2, n)-1);
		HaNoi(1,3,n);
		System.out.println(sb);
	}
	private static void HaNoi(int a, int b, int n) {
		if (n==1) {
			sb.append(a).append(" ").append(b).append("\n");
			return;
		}
		HaNoi(a,6-a-b,n-1);
		sb.append(a).append(" ").append(b).append("\n");
		HaNoi(6-a-b,b,n-1);
	}
}
