import java.util.Scanner;

public class Subs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(S.substring(start, end));
    }
}
