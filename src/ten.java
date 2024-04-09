import java.util.Scanner;

public class ten {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPowerOfTwo(n);
        if (!res){
            System.out.println(n + " is not a power of two");
        }
        else {
            System.out.println(n + " is a power of two");
        }
    }
}

