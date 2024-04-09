import java.util.ArrayList;
import java.util.Scanner;

public class second {
    public static int sumOfElements(ArrayList<Integer> arr, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return arr.get(n - 1) + sumOfElements(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        System.out.println(sumOfElements(arr, n));
    }
}
