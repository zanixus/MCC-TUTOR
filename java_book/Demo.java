import java.util.Scanner;
public class Demo {
//You are to write a program (BookExceptionsDemo.java) that will create and, using user input,
//        populate an array of instances of the class Book.
//        The class Book is loaded in our Canvas files: Book.javaPreview the document
//
//        The user will enter a number n (n must be > 0, trap the user until they input a valid value for n),
    static int getInput() {
        int n = 0;
        Scanner keyboard = new Scanner(System.in);
        while (n < 1) {
            System.out.printf("Please enter a number greater than 0.\n");
            n = keyboard.nextInt();
            keyboard.nextLine();
        }
        return n;
    }

    static void popBooks(Book[] theBooks) throws Exception {
        String title, author, category;
        int pages;
        boolean isRead;
        double cost;
        for (int i = 0; i < theBooks.length; i++) {
            theBooks[i] = new Book(title, author, pages, category, isRead, cost);
        }
    }

//}
//    public Book(String titlePassed, String authorPassed, int pagesPassed,
//                String categoryPassed,  boolean readPassed, double costPassed)

    static Book[] cookTheBooks(Book[] theBooks) throws Exception {

        return theBooks;
    }
//        Your program will declare and create an array of size n of instances of the class Book.
//        The user will be asked to enter the information for each instance that is to be created.
//        The following exceptions will be thrown if the user enters information that is not appropriate to the request:
//        InputMismatchException: Thrown if the user enters a non-matching type.
//        Trap the user until they enter a valid value.
//        PagesException: Thrown if the user enters a number <=0  for the number of pages.
//        Trap the user until they enter a valid value.
//        CostException: Thrown if the user enters a number < 0  for the cost of the book.
//        Trap the user until they enter a valid value.
//        CategoryException: Thrown if the user enters a value other than "Fiction", “Non-Fiction"," +
//        " "Reference",  or  “Text" for the category of the book. Trap the user until they enter a valid value.
//        You are to create the classes PageException,.java, CostException.java and CategoryException.java
//        (children of the class Exception).  The string stored in the instance variable message of the
//        respective exception classes should indicate which exception was thrown. InputMismatchException
//        is a class of the Java language, see the Java API for more information.
//        Upon entrance of acceptable information the gathered information will be
//        the arguments passed to the non-default constructor, of the Book class, the instance
//        created will be saved in the array of instances of the class Book.
//        Name your program BookExceptionsDemo_yourInitials..java, where yourInitials
//        represents your initials and send all programs developed for this assignment (including Book.java).
//        It would be helpful if you could put those files in a zip file
//        (name that zip file BookExceptions_yourInitials.zip, where yourInitials represents your initials).
    public static void main(String[] args) {
        int size = getInput();
        Book theBooks[] = new Book[size];
        popBooks(theBooks);
        
    }


    // P3. Sum of the Years
    System.out.printf("Sum of the years' digits depreciation model:\n");
    double sumOfYears = 0, fraction;
    double bookValueK = cost, productionLife = usefulLife;
    int k;
    for (k = 1; k<=usefulLife;k++)
    {//this loop finds our sumOfYears variable for us
        sumOfYears = sumOfYears + (double)k;
    }
    for (k = 1; k <= usefulLife;k++)
    {
        fraction = productionLife / sumOfYears;
        expenseK = fraction * (bookValueK - salvageValue);
        System.out.printf("Year %1d: %1s\n", k, usDollars.format(expenseK));
        productionLife--;
    }
}




}