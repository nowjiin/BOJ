import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		String[] str = new String[2];
		
		for (int i = 0; i < T; i++) {
			String answer = "";
			str = scanner.nextLine().split(" ");
            
			for (int k = 0; k < str[1].length(); k++) {
				for (int j = 0; j < Integer.parseInt(str[0]); j++) {
					answer = answer.concat(Character.toString(str[1].charAt(k)));
				}
			}
			System.out.println(answer);
		}
		scanner.close();
	}
}
