import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		Integer arr[] = new Integer[number.length()];
		
		for(int i=0; i<number.length(); i++) {
			arr[i]=number.charAt(i)-48;
		}
			
        Arrays.sort(arr,Collections.reverseOrder());
        
		for(int i : arr) {
			System.out.print(i);
		}
	}
}
