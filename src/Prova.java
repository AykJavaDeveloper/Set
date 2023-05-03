import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String input = in.nextLine();

        for (String substring : input.split("\\s+")) {
            if (substring.equals("One")) {
                continue;
            }

            System.out.println(substring);
        }
    }
}
