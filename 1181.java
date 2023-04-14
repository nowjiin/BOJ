import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {		
 		FastReader fr = new FastReader();
 
		int N = fr.nextInt();
		String[] arr = new String[N];
 
		for (int i = 0; i < N; i++) {
			arr[i] = fr.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
 
		System.out.println(arr[0]);
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
		
	}

  public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in)); 
		}
		public FastReader(String s) throws FileNotFoundException { 
			br = new BufferedReader(new FileReader(new File(s))); 
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (IOException e) { e.printStackTrace(); }
			}
			return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
		String nextLine() {
			String str = "";
			try { str = br.readLine(); }
			catch (IOException e) { e.printStackTrace(); }
			return str;
		}
	}
}
