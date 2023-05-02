public class Prova {
    public static void main(String[] args) {
        String ploot = "One Two Three";
        String plootMin = "";

        for (String substring : ploot.split("\s")) {
            if (substring.equals("One")) {
                continue;
            }

            plootMin = plootMin + substring + "\n";
        }
        System.out.println(plootMin);
    }
}
