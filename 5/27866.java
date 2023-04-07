import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = scanner.nextInt();

        System.out.println(a.charAt(b-1));
        scanner.close();
        
    }
}
