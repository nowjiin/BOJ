import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N+1];
        for(int k=1;k<=N;k++){
            basket[k]=k;
        }
        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while (i<j){
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }
        }
      
        for(int k=1;k<=N;k++){
            System.out.print(basket[k] + " ");
        }
        br.close();
    }
}
