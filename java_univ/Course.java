/**
 @author Kevin M. Mallgrave
 Professor Janet Brown-Sederberg
 CTIM-168 W01
 @since  09 Mar 2019

 Class Course

 Object definition for a college course

 @version 1.0: initial release
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Course {
// Instance variables
//
    private String department;
    private int courseNumber;
    private int courseCredits;
    private double courseCost;
// Constructors
//
    public Course() {
        this.setDepartment("unknown");
        this.setCourseNumber(100);
        this.setCourseCredits(3);
        this.setCourseCost(3 / 2 * 500);
    }

    public Course(String dept, int course, int credits) {
        this.setDepartment(dept);
        this.setCourseNumber(course);
        this.setCourseCredits(credits);
        this.setCourseCost(credits / 2 * 500);
    }
// Getter methods
//
    public String getDepartment() {
        return this.department;
    }

    public int getCourseNumber() {
        return this.courseNumber;
    }

    public int getCourseCredits() {
        return this.courseCredits;
    }

    public double getCourseCost() {
        return this.courseCost;
    }

    public String toString() {
        DecimalFormat dollars = new DecimalFormat ("'$'0.00");
        String objectInfo;
        objectInfo = "\nDepartment:      " + this.getDepartment()
                +    "\nCourse number:   " + this.getCourseNumber()
                +    "\nCourse credits:  " + this.getCourseCredits()
                +    "\nCourse cost:     " + dollars.format(this.getCourseCost());
        return objectInfo;
    }

    public boolean equals(Course collegeCourse) {
        boolean isEqual = false;
        isEqual =(this.getDepartment() == collegeCourse.getDepartment()
                && this.getCourseNumber() == collegeCourse.getCourseNumber()
                && this.getCourseCredits() == collegeCourse.getCourseCredits()
                && this.getCourseCost() == collegeCourse.getCourseCost()
        );
        return isEqual;
    }
    //
// Setter methods

    public void setDepartment(String department) {
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = false;
        while (isValid == false) {
            switch (department) {
                case "ENGL":
                    isValid = true;
                    break;
                case "MATH":
                    isValid = true;
                    break;
                case "HIST":
                    isValid = true;
                    break;
                case "COMP":
                    isValid = true;
                    break;
                case "HUMN":
                    isValid = true;
                    break;
                case "SCIE":
                    isValid = true;
                    break;
                case "LANG":
                    isValid = true;
                    break;
                case "PHYS":
                    isValid = true;
                    break;
                default:
                    System.out.println("Please enter a valid department.");
                    System.out.println("Department must be ENGL, MATH, COMP, HIST, HUMN, SCIE, LANG, PHYS.");
                    department = keyboard.nextLine().toUpperCase();
                    break;
            }
        }
        this.department = department;
    }

    public void setCourseNumber(int courseNumber) {
        Scanner keyboard = new Scanner(System.in);
        while  (courseNumber < 100 || courseNumber > 399) {
            System.out.println("Please enter a valid course number, 100-499: ");
            courseNumber = keyboard.nextInt();
            keyboard.nextLine();
        }
        this.courseNumber = courseNumber;
    }

    public void setCourseCredits(int courseCredits) {
        Scanner keyboard = new Scanner(System.in);
        while  ((courseCredits < 3 || courseCredits > 6) || (courseCredits == 5)
        )
        {
            System.out.println("Please enter a valid number of credits per course, 3, 4 or 6:");
            courseCredits = keyboard.nextInt();
            keyboard.nextLine();
        }
        this.courseCredits = courseCredits;
    }

    public void setCourseCost(int cost) {
        this.courseCost = cost;
    }
}