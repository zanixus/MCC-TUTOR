import java.util.Scanner;

public class deckofcards {

    public static void main(String[] args) {
        Card[] deck = new Card[52];
        DeckMethods.populateDeck(deck);
        DeckMethods.printDeck(deck);
        DeckMethods.shuffleDeck(deck);
        Card[] player1 = new Card[5];
        Card[] player2 = new Card[5];
        for (int j = 0; j < 5; j++) {
            player1[j] = DeckMethods.popCard(deck);
            player1[j].setDealt(true);
            }
        for (int k = 0; k < 5; k++) {
            player2[k] = DeckMethods.popCard(deck);
            player2[k].setDealt(true);
        }
         DeckMethods.printDeck(player1);
         DeckMethods.printDeck(player2);
         bubbleSort(player1);
         bubbleSort(player2);
         System.out.println();
         System.out.println("Player 1 sorted:");
         DeckMethods.printDeck(player1);
         System.out.println();
         System.out.println("Player 2 sorted:");
         DeckMethods.printDeck(player2);
    }

        public static void bubbleSort (Card hand[]) {
            int[] arr = new int[hand.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = hand[i].getValue();
            }
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        Card tempCard = hand[j];
                        hand[j] = hand[j + 1];
                        hand[j + 1] = tempCard;
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

}



