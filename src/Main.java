import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hello@skillbox.ru
        //mail@mail.ru
        HashSet<String> storageEmails = new HashSet<>();


        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input email: ");
            String input = in.next();

            String regex = "[a-z0-9\\.\\-\\_]+[@][a-z]+[\\.][a-z]{2,3}";
            boolean equals = input.matches(regex);
            if (equals == true) {
                storageEmails.add(input);
            }

            if (input.equals("LIST")) {
                for (String substring : storageEmails) {
                    System.out.println(substring);
                } break;
            }
        }
    }
}