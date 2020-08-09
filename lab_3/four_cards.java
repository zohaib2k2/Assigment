public class four_cards{
    public static void main(String[] args) {
        final int ncards = 52;
        int[] deck = new int[ncards];
        int i,pick;
        int[] picked_cards = new int[4];

        
        for (i = 0; i < deck.length ; i++ ) deck[i] = i;

        /*
        * picking 4 cards randomly from deck
        * because statistically it is equivilent to picking
        * first four cards from a shuffled deck
        */
        for (i = 0; i < picked_cards.length ; i++ ) {
            pick = (int)(Math.random()*51);
            picked_cards[i] = deck[pick];
        }
        System.out.print("Cards Picked:\n\n");
        for(i = 0; i < picked_cards.length; i++){
            if (picked_cards[i] >= 0 && picked_cards[i] <= 12) {
                System.out.println(picked_cards[i]+" Spade");
            } else if (picked_cards[i] >= 13 && picked_cards[i] <= 25) {
                System.out.println(picked_cards[i]+" Heart");
            } else if (picked_cards[i] >= 26 && picked_cards[i] <= 38) {
                System.out.println(picked_cards[i]+" Diamonds");
            }else if (picked_cards[i] >= 39 && picked_cards[i] <= 51) {
                System.out.println(picked_cards[i]+" Clubs");
            }
        }

    }
}
