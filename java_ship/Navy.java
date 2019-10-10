import java.util.Scanner;
public class Navy {

    /*
    Write a class, name it Navy_yourInitials.java, where yourInitials
    represent your initials, in which you declare an array of 3 ships.
     Using input from the user create an instance of a Ship, a CruiseShip
     and a CargoShip and populate the array with those instances.
     After population of the array iterate through the array and have
      each instance call its’ toSting method and print the returned string.
     */

    public static void getInput(Ship[] navy) {
        String name;
        int year, passengerCapacity, cargoCapacity;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the name of your ship.");
        name = keyboard.nextLine();
        System.out.println("Please enter the year of your ship.");
        year = keyboard.nextInt(); keyboard.nextLine();
        navy[0] = new Ship(name, year);
        System.out.println("Please enter the name of your cruise ship.");
        name = keyboard.nextLine();
        System.out.println("Please enter the year of your cruise ship.");
        year = keyboard.nextInt(); keyboard.nextLine();
        System.out.println("Please enter the maximum passenger capacity of your cruise ship.");
        passengerCapacity = keyboard.nextInt(); keyboard.nextLine();
        navy[1] = new CruiseShip(name, year, passengerCapacity);
        System.out.println("Please enter the name of your cargo ship.");
        name = keyboard.nextLine();
        System.out.println("Please enter the year of your cargo ship.");
        year = keyboard.nextInt(); keyboard.nextLine();
        System.out.println("Please enter the maximum passenger capacity of your cargo ship.");
        cargoCapacity = keyboard.nextInt(); keyboard.nextLine();
        navy[2] = new CargoShip(name, year, cargoCapacity);
    }

    public static void printArray(Ship[] navy) {
        for (int i = 0; i < navy.length; i++) {
            System.out.println(navy[i].toString());
        }
    }

    public static void main(String[] args) {
        Ship[] navy = new Ship[3];
        getInput(navy);
        printArray(navy);
    }java
}