import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
			
			long n= scanner.nextInt();

			for(int i = 1; i <= n; i++){
				if(i%4 == 0)
					System.out.println("long");
			}
			System.out.println("int");
			
    }
}
