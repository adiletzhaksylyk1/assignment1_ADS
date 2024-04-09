import java.util.Scanner;

public class eight {
    public static void seq(int n, int k, String sequence) {
        if (n == 0) {
            System.out.println(sequence);
        } else {
            for (int i = 1; i <= k; i++) {
                seq(n - 1, k, sequence + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        seq(n, k, "");
    }
}
