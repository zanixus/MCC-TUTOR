import java.util.Scanner;
public class heads {

    static double getBet() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a bet in US dollars: ");
        double bet = keyboard.nextDouble();
        return bet;
    }

    static int getToss() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of coin tosses: ");
        int toss = keyboard.nextInt();
        return toss;
    }
    static void recursion(double bet, int tosses, double[] losses) {
        losses[tosses - 1] = bet;
        if (tosses > 1) {
            bet += bet;
            tosses--;
            System.out.printf("Potential losses: -$%.2f\n" , bet);
            recursion(bet, tosses, losses);
        }
        //if tosses 0, base case = do not execute recursively
    }

    public static void main(String[] args) {
        double bet = getBet();
        int toss = getToss();
        double total = 0;
        double[] losses = new double[toss];
        System.out.printf("Potential losses: -$%.2f\n" , bet);
        recursion(bet, toss, losses);
        for (int i = 0; i < losses.length; i++) {
            total += losses[i];
        }
        System.out.printf("Total potential losses: -$%.2f\n" , total);
    }
}