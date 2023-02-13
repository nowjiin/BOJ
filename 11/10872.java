import java.io.*;

public class Main {
    static int factorial(int num) {
        if (num < 2) 
            return 1;
        return (num * factorial(num - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }
}
