package employee;

public abstract class Employee {
    int id;
    String name;
    String email;
    String phone;
    double salary;

    public void getEmployeeDetails() {
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Id:" + id);
        System.out.println("Employee Email:" + email);
        System.out.println("Employee Phone:" + phone);
        System.out.println("Employee Salary:" + salary);
    }

    abstract public void calculatePay(int days);
}
