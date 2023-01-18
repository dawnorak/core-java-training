public class AskJava {
    public static void main(String[] args) {
        
        double change = 4.50;
        double price = 2.50;
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");

        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacity >= people)+ "\n");

        String request = "PS5";
        String purchase = "XBOX";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (request.equals(purchase)) + "\n");

        int space = 20;
        int guests = 18;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (space >= guests) + "\n");

        int yourVotes = 59;
        int competitorVotes = 60;
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");
    }
}
