public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "win", "WIN", "loss", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equalsIgnoreCase("WIN")) {
                wins++;
            } else {
                losses++;
            }
        }
        System.out.println("\nWith a professional record of " + wins + " wins and " + losses + " losses.");
    }
}
