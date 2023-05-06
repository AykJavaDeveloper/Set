import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //hello@skillbox.ru
        //mail@mail.ru
        TreeSet<String> storageEmails = new TreeSet<>();


        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input email: ");
            String input = in.nextLine();


            for (String substring : input.split("\\s+")) {

                if (substring.equals("ADD")) {
                    continue;
                }
                String regex = "[a-z0-9\\.\\-\\_]+[@][a-z]+[\\.][a-z]{2,3}";
                boolean equals = substring.matches(regex);
                if (equals == true) {
                    storageEmails.add(substring);
                }
            }
            if (input.equals("LIST")) {
                for (String currentEmail : storageEmails) {
                    System.out.println("Current Email: " + currentEmail);
                }
                break;
            }
        }
    }
}