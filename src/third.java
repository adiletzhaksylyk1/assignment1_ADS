import java.util.Scanner;

public class third {
    public static int sumOfElements(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + sumOfElements(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfElements(n));
    }
}
