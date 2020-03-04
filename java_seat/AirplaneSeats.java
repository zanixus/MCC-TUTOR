
/*

 */

import java.util.Random;
import java.util.Scanner;

public class AirplaneSeats {

    public static void seatMap(Seat[][] plane, int x, int y) {
        System.out.printf("Map of seats:\n\n");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (plane[i][j].getOccupied()) {
                    System.out.printf("X  ");
                } else {
                    System.out.printf("O  ");
                }
            }
            System.out.printf(" <--- Row %d\n", i);
        }
        System.out.printf("\n0 is available, X unavailable:\n\n");
    }

    public static void seatInfo(Seat[][] plane, int x, int y) {
        System.out.println(plane[x][y].toString());
    }

    public static void seatBuy(Seat[][] plane, int x, int y) {
        if (plane[x][y].getOccupied() == true) {
            System.out.printf("Error: Row %d, Seat %d unavailable.\n", x, y);
        } else {
            plane[x][y].setOccupied(true);
        }
    }

    public static void seatPop(Seat[][] plane, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                plane[i][j] = new Seat(i, j);
            }
        }
    }

    public static void seatSort(Seat[][] plane, int x, int y) {
        Seat[] allSeats = new Seat[x * y];
        int[] seatPrice = new int[x * y];
        int counter = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!plane[i][j].getOccupied()) {
                    allSeats[counter] = plane[i][j];
                    counter++;
                }
            }
        }
        for (int i = 0; i < allSeats.length; i++) {
            seatPrice[i] = allSeats[i].getCost();
        }
        int n = seatPrice.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (seatPrice[j] > seatPrice[j + 1]) {
                    int temp = seatPrice[j];
                    Seat tempSeat = allSeats[j];
                    allSeats[j] = allSeats[j + 1];
                    allSeats[j + 1] = tempSeat;
                    seatPrice[j] = seatPrice[j + 1];
                    seatPrice[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < allSeats.length; i++) {
            System.out.println(allSeats[i].toString());
        }
    }

    public static boolean seatMenu(Seat[][] plane, int x, int y) {
        boolean userHasQuit = false;
        int row, seat;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPlease select from the following menu:");
        System.out.println("Enter 1 to see a map of the seats: O available, X unavailable.");
        System.out.println("Enter 2 to get the information on a specific seat.");
        System.out.println("Enter 3 to print available seats sorted by price, low to high.");
        System.out.println("Enter 4 to purchase a seat.");
        System.out.println("Enter 5 to see this menu again.");
        System.out.println("Enter 0 to quit.\n");
        String choice = keyboard.nextLine();
        switch (choice) {

            case "1":
                seatMap(plane, x, y);
                System.out.printf("Press any key to continue.\n");
                choice = keyboard.nextLine();
                break;

            case "2":
                System.out.printf("Please enter the row of the seat you would like to view.\n");
                seat = keyboard.nextInt();
                System.out.printf("Please enter the seat number in row %d, 1-4\n", seat);
                row = keyboard.nextInt();
                keyboard.nextLine();
                seatInfo(plane, seat, row);
                System.out.printf("Press any key to continue.\n");
                choice = keyboard.nextLine();
                break;

            case "3":
                seatSort(plane, x, y);
                break;

            case "4":
                System.out.printf("Please enter the row of the seat you would like to view.\n");
                row = keyboard.nextInt();
                System.out.printf("Please enter the seat number in row %d, 1-4\n", row);
                seat = keyboard.nextInt();
                keyboard.nextLine();
                seatBuy(plane, seat, row);
                System.out.printf("Press any key to continue.\n");
                choice = keyboard.nextLine();
                break;

            case "5":
                break;

            case "0":
                userHasQuit = true;
                break;

            default:
                break;
        }
        return userHasQuit;
    }

    public static void main(String[] args) {
        final int x = 5, y = 4;
        boolean quit = false;
        Seat[][] plane = new Seat[x][y];
        seatPop(plane, x, y);
        while (quit == false) {
            quit = seatMenu(plane, x, y);
        }
        exit(0);
    }
}