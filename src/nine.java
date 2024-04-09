import java.util.Scanner;

public class nine {
public static void permutation(String string, String letter) {
    if (string.isEmpty()) {
        System.out.println(letter);
    } else {
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            String newRemaining = string.substring(0, i) + string.substring(i + 1);
            permutation(newRemaining, letter + symbol);
        }
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        permutation(inputString, "");
    }
}
