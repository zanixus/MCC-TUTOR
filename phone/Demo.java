import java.util.Scanner;
//n this assignment you will be processing employee data. You have a number of employees (that number determined by user input).
//        You will be recording each employee’s name, salary, and telephone number, as well as any other data you need or think is
//        appropriate. It is important that you record the employee telephone number in valid form, therefore you will develop two
//        exception classes.
//
//        You will be developing the following classes:
//
//        The class Employee which will be derived from the class Person (linked here: Person.java).
//        Preview the document The class Employee should have constructors, accessor methods, mutator
//        methods a toSting method, an equals method and any additional methods you feel necessary.
//        Every Employee object should record the employee’s name, salary, and telephone number, as
//        well as any other data you need or think is appropriate.
//        The class TelephoneNumberLengthException for when the telephone number entered—without dashes
//        or spaces—is not exactly ten digits. When an exception is thrown, the user should be reminded o
//        f what she or he entered, told why it is inappropriate, and asked to reenter the data.
//        The class TelephoneNumberCharacterException for when any character in the telephone number is not
//        a digit. When an exception is thrown, the user should be reminded of what she or he entered,
//        told why it is inappropriate, and asked to reenter the data. The class DemoTelephoneNumber_yourInitials.java
//        (where yourInitials represent your initials), a driver a program to enter employee data, including telephone
//        number and salary, into an array. The maximum number of employees is 100, but your program should also work
//        for any number of employees less than 100. After all data has been entered, your program should display the r
//        ecords for all employees, with an annotation stating whether the employee’s salary is above
//        or below average. Submit all 4 files.
public class Demo {

    static boolean isNumeric(String s) {
        return s.matches("^\\d+$");
    }

    static Employee hireNewGuy(int i) throws Exception {
        String name;
        String phoneNumber = "";
        double salary = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter a name for employee %d.\n", i + 1);
        name = keyboard.nextLine();
        System.out.printf("Please enter a 10 digit phone number for employee %d.\n", i + 1);
        phoneNumber = keyboard.nextLine();
        if (!isNumeric(phoneNumber)) {
            throw new TelephoneNumberCharacterException();
        }
        if (phoneNumber.length() != 10) {
            throw new TelephoneNumberLengthException();
        }
        System.out.printf("Please enter a salary for employee %d.\n", i + 1);

        salary = keyboard.nextDouble(); keyboard.nextLine();
        Employee newGuy = new Employee(name, salary, Integer.parseInt(phoneNumber));
        return newGuy;
    }

    static void roster(Employee[] wageslaves) {
        //print employee info here and average salary...
    }

    public static void main(String[] args) {
        boolean validInput = false;
        int size = 1;
        Employee spacelySpaceSprockets[] = new Employee[size];
        for (int i = 0; i < spacelySpaceSprockets.length; i++) {
            validInput = false;
            while (!validInput) {
                try {
                    spacelySpaceSprockets[i] = hireNewGuy(i);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.out.println("Please check your input.");
                }
            }
        }
    }
}