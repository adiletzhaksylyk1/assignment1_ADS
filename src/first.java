import java.util.Scanner;

public class first {
    public static int sumOfSquares(int n) {
        if (n==1){
            return 1;
        }
        else{
            return n*n + sumOfSquares(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
    }
}