import java.util.Scanner;
public class jeopardy {

    static int getSize() {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter a positive int\n");
        int size = keyboard.nextInt();
        return size;
    }

    static int[] getArray(int n) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Please enter a number for array position %d.\n", i);
            array[i] = keyboard.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\tArray: %d", array[i]);
        }
        System.out.println();
    }

    public static void computeCumulativeSums(int arrayPassed[], int size) {
        if (size != 0) {
            arrayPassed[size] = arrayPassed[size] + arrayPassed[size - 1];
        }
        if (size < arrayPassed.length - 1) {
            computeCumulativeSums(arrayPassed, size + 1);
        }import java.util.Scanner;
public class jeopardy {

    static int getSize() {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter a positive int\n");
        int size = keyboard.nextInt();
        return size;
    }

    static int[] getArray(int n) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Please enter a number for array position %d.\n", i);
            array[i] = keyboard.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\tArray: %d", array[i]);
        }
        System.out.println();
    }

    public static void computeCumulativeSums(int arrayPassed[], int size) {
        if (size == 0) {
            //base case
        }
        if (size != 0) {
            arrayPassed[size] = arrayPassed[size] + arrayPassed[size - 1];
        }
        if (size < arrayPassed.length - 1) {
            computeCumulativeSums(arrayPassed, size + 1);
        }
    }

    public static void main(String[] args) {
        int n = getSize();
        int[] array = getArray(n);
        System.out.printf("Original array contents:\n");
        printArray(array);
        computeCumulativeSums(array, n - 1);
        System.out.printf("After recursive call:\n");
        printArray(array);
    }
}
    }

    public static void main(String[] args) {
        int n = getSize();
        int[] array = getArray(n);
        System.out.printf("Original array contents:\n");
        printArray(array);
        computeCumulativeSums(array, 0);
        System.out.printf("After recursive call:\n");
        printArray(array);
    }
}