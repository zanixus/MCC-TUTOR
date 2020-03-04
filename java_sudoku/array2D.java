/**
 @author Kevin M. Mallgrave

 In this assignment you are to develop a program that will (in the main method) accept an int (0 - 9 inclusive),
 trapping the user if they enter an invalid value, save the value entered as size.

 You are to then develop a method that will accept the value stored in size
 and print a size x size array of random numbers 1 - size * size with no repeats.

 Call the method above from within the main method.

 Samples of the input/output are:


 ----jGRASP exec: java GenerateSudoku_Size
 Please enter a positive int, 0 - 9
 3
 9    1    2
 4    6    7
 5    3    8

 */
import java.util.Scanner;
import java.util.Random;

public class array2D {

    public static int getInt() {
        Scanner keyboard = new Scanner(System.in);
        int input = -1;
        while (input < 0 || input > 9) {
            System.out.printf("Enter a number, 0-9:");
            input = keyboard.nextInt();
        }
        keyboard.nextLine();
        return input;
    }

    public static void printArray(int size) {
        Random popArray = new Random();
        int[][] array2d = new int[size][size];
        int[] source = new int[size * size];
        for (int i = 0; i < source.length; i++) {
            source[i] = i + 1;
        }
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                int popper = 0, temp = 0;
                while (temp == 0) {
                    popper = popArray.nextInt(size * size);
                    temp = source[popper];
                }
                source[popper] = 0;
                array2d[i][j] = temp;
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < array2d.length; j++) {
                System.out.printf("%2d    ", array2d[i][j]);
            }
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int size = getInt();
        printArray(size);
    }
}