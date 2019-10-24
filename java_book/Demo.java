import java.util.Scanner;

public class Demo {

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

    static Book cookTheBooks(int i) throws Exception {
        String title, author, category;
        int pages = -1;
        boolean isRead = false;
        double cost = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter a book name for book %d.\n", i + 1);
        title = keyboard.nextLine();
        System.out.printf("Please enter a book author for book %d.\n", i + 1);
        author = keyboard.nextLine();
        System.out.printf("Please enter a book category for book %d.\n", i + 1);
        category = keyboard.nextLine();
        if (!category.matches("Fiction") && !category.matches("Non-Fiction")) {
            throw new CategoryException();
        }
        System.out.printf("Please enter a cost for book %d.\n", i + 1);
        cost = keyboard.nextInt();
        keyboard.nextLine();
        if (cost < 0) {
            throw new CostException();
        }
        System.out.printf("Please enter number of pages for book %d.\n", i + 1);
        pages = keyboard.nextInt();
        keyboard.nextLine();
        if (pages < 1) {
            throw new PageException();
        }
        System.out.printf("Have you read book %d? true or false.\n", i + 1);
        isRead = keyboard.nextBoolean();
        keyboard.nextLine();
        Book newBook = new Book(title, author, pages, category, isRead, cost);
        return newBook;
    }

    public static void main(String[] args) {
        boolean validInput = false;
        int size = 1;
        while (!validInput) {
            try {
                size = getInput();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Please enter a number greater than 0.");
            }
        }
        Book theBooks[] = new Book[size];
        for (int i = 0; i < theBooks.length; i++) {
            validInput = false;
            while (!validInput) {
                try {
                    theBooks[i] = cookTheBooks(i);
                    validInput = true;
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.out.println("Please check your input.");
                }
            }
        }
    }
}