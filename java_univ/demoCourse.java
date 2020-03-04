import java.util.Scanner;
public class demoCourse {



    static int getNumberOfCourses() {
        int n = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of courses in semester");
        n = keyboard.nextInt();
        keyboard.nextLine();


        return n;

    }

    static Course[] getCourseInfo(int n) {
        Scanner keyboard = new Scanner(System.in);
        Course course[] = new Course[n];
        for (int i = 0; i < course.length; i++) {
            String department;
            int number, credits;
            boolean lab = false;
            System.out.println("Enter course department");
            department = keyboard.nextLine();
            System.out.println("Enter course number");
            number = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter course credits");
            credits = keyboard.nextInt();
            keyboard.nextLine();

            switch (department)
            {
                case "PHYS":
                case "SCIE":
                case "COMP":
                    lab = true;
                    break;
            }
            if (lab == true)
            {
                course[i] = new LabCourse(department, number, credits);
            }
            else
            {
                course[i] = new Course(department, number, credits);
            }

        }
        for (int i = 0; i < course.length; i++)
        {
            System.out.println("Course number " + i + 1 + ": " + course[i].toString());

        }
        return course;
    }



    public static void main(String[] args) {
        int n = getNumberOfCourses();
        getCourseInfo(n);


    }
}