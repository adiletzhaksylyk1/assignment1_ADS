import java.util.Scanner;

public class sixth {
    public static void reverseSeq(int n) {
        Scanner sc = new Scanner(System.in);
        if (n>=1 && n<=100) {
            String inputString = sc.nextLine();
            reverseSeq(n - 1);
            System.out.println(inputString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseSeq(n);
    }
}
