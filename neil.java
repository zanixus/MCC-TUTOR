/**                                                         @version 1.0
 *   @author Kevin M. Mallgrave
 *           Professor Janet Brown-Sederberg
 *           CTIM-157 B02
 *   @since  02 November 2018
 *
 *   You have three identical prizes to give away and a pool of ten finalists.
 *   The finalists are assigned numbers from 1 to 10.
 *   Write a program to randomly select the numbers of three finalists to receive a prize.
 *   Make sure not to pick the same number twice. For example, picking finalists
 *   3, 6, 2 would be valid but picking 3, 3, 11 would be invalid because
 *   finalist number 3 is listed twice and 11 is not a valid finalist number.
 *
 *   Version 1.0: initial release
 */

import java.util.Random;
public class neil {
  import java.util.Scanner;
    public class DemoTelephoneNumber_AR
    {
        public static void main(String[] args) throws Exception
        {
            Scanner keyboard = new Scanner(System.in);
            boolean validInput = false;
            long maximumValue = 9999999999;
            long minimumValue = 1000000000;
            int size = 100;
            Person[] Employees = new Person[size];
            for(int i = 0; i < size; i++)
            {
                while(!validInput)
                {
                    try
                    {
                        System.out.println("Enter name:");
                        String name = keyboard.nextLine();
                        System.out.println("Enter telephone number:");
                        String number = keyboard.nextLine();
                        if(number.length != 10)
                        {
                            throw new TelephoneNumberLengthException();
                            keyboard.nextLine();
                            System.out.println("Enter salary:");
                            double salary = keyboard.nextDouble();
                            keyboard.nextLine();
                        }
           catch(TelephoneNumberLengthException)
                            {
                                    System.out.println("Enter wrong lent:");
            }

                    }
                }
            }
        }
}