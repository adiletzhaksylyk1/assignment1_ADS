import java.util.Scanner;

public class fourth {
    public static double sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return Math.pow(b,n) + sumOfPowers(b, (n-1));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sumOfPowers(b, n));
    }
}
