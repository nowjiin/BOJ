import java.io.*;
import java.util.*;

public class Main {
	public static long fibonacci(int num, HashMap<Integer, Long> dp){
		if(dp.containsKey(num)){
			return dp.get(num);
		} else if(num == 0){
			return 0;
		} else if(num < 2){
			return 1;
		} else{
			long result = fibonacci(num-1, dp) + fibonacci(num-2, dp);
			dp.put(num, result);
			return result;
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<Integer, Long> dp = new HashMap<Integer, Long>();
		
	    System.out.println(fibonacci(n, dp));

		scan.close();
	}
}
