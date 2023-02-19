import java.util.*;

public class Main {
    static int count, num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        num = k;
        int[] a = new int[n];
        int[] tmp = new int[n+1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        merge_sort(a, 0, n - 1, tmp);

        if (count < k) {
            System.out.println(-1);
        } else {
            System.out.println(num);
        }
    }

    private static void merge_sort(int[] a, int p, int r, int[] tmp) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(a, p, q, tmp);
            merge_sort(a, q + 1, r, tmp);
            merge(a, p, q, r, tmp);
        }
    }

    private static void merge(int[] a, int p, int q, int r, int[] tmp) {
        int i = p, j = q + 1, t = 1;

        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[t++] = a[i++];
            } else {
                tmp[t++] = a[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = a[i++];
        }
        while (j <= r) {
            tmp[t++] = a[j++];
        }
        i = p;
        t = 1;
        while (i <= r) {
            a[i++] = tmp[t++];
            if (++count == num) {
                num = tmp[t - 1];
            }
        }
    }
}
