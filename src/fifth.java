import java.util.Scanner;

public class fifth {
    public static void reverseSeq(int n) {
        Scanner sc = new Scanner(System.in);
        if (n>0) {
            int num = sc.nextInt();
            reverseSeq(n - 1);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseSeq(n);
    }
}