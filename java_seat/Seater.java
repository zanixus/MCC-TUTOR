import java.util.Random;

public class Seater {

    public static void showSeat(Seat[][] plane, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(plane[i][j].toString());
            }
        }
    }

    public static void popSeat(Seat[][] plane, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                plane[i][j] = new Seat(i, j);
            }
        }
    }

    public static void seatSortByPrice(Seat[][] plane, int x, int y) {
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

    public static void options(Seat[][] plane, int x, int y) {
        //case structure for options goes here...
    }

    public static void main(String[] args) {
        final int x = 5, y = 4;
        Seat[][] plane = new Seat[x][y];
        popSeat(plane, x, y);
        showSeat(plane, x, y);
        seatSortByPrice(plane, x, y);
    }
}