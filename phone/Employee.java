public class Employee extends Person {
    //
    private double salary;
    private int phoneNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.phoneNumber = 1118675309;
    }

    public Employee(String name, double salary, int phoneNumber) {
        this.setName(name);
        this.setSalary(salary);
        this.setPhoneNumber(phoneNumber);
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public void setPhoneNumber(int p) {
        this.phoneNumber = p;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        String objectInfo;
        objectInfo = "\nWRITEME:      ";
        return objectInfo;
    }

    public boolean equals(Employee employee) {
        boolean isEqual = false;
        if ((employee != null) && (employee instanceof Employee)) {
            Employee employeeInstance = (Employee) employee;
            isEqual = super.equals(employeeInstance);
        }
        return isEqual;
    }
}