import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n) + " " + (n - 2));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) 
            return 1;
        else 
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
