/**                                                       @version 1.0
 @author Kevin M. Mallgrave
 Professor Janet Brown-Sederberg
 CTIM-168 B02
 @since  09 Mar 2019

 Class LabCourse

 Object definition for a lab college course. Adds 50 to courseCost. Extends Course.

 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class LabCourse extends Course {
    //
    public LabCourse() {
        super();
        this.setDepartment("COMP");
        this.setCourseCost(3 / 2 * 500 + 100);
    }

    public LabCourse(String dept, int course, int credits) {
        System.out.println(dept);
        this.setDepartment(dept);
        this.setCourseNumber(course);
        this.setCourseCredits(credits);
        this.setCourseCost(credits / 2 * 500 + 100);
    }

    public String toString() {
        DecimalFormat usd = new DecimalFormat ("'$'0.00");
        String objectInfo;
        objectInfo = "\nDepartment:      " + this.getDepartment()
                +    "\nCourse number:   " + this.getCourseNumber()
                +    "\nCourse credits:  " + this.getCourseCredits()
                +    "\nLab course cost: " + usd.format(this.getCourseCost());
        return objectInfo;
    }

    public boolean equals(LabCourse collegeCourse) {
        boolean isEqual = false;
        if ((collegeCourse != null) && (collegeCourse instanceof Course)) {
            Course courseInstance = (Course) collegeCourse;
            isEqual = super.equals(courseInstance);
        }
        return isEqual;
    }
}