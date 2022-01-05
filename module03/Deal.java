

public class Deal {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", 
                         "9", "10", "J", "Q", "K", "A"};
        
        String[] deck = new String[suits.length * rank.length];

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j ++) {
                deck[i + suits.length * j] = suits[i] + rank[j];
            }
        }
        
        // we deal n poker cards. poker card is a set of five cards
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {

                String t = "";
                int card = (int) (Math.random() * 52);

                // push card to front of deck
                t = deck[5*i + j];
                deck[5*i + j] = deck[card];
                deck[card] = t;

                // print out card
                System.out.print(deck[5*i + j] + " ");
            }
            System.out.println();
        }
    }
}
