package employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee(1, "Aaru", "Aaru@gmail.com", "8967456321");
        e1.calculatePay(25);
        e1.getEmployeeDetails();
        System.out.println();
        Employee e2 = new HourlyEmployee(1, "Narean", "Narean@gmail.com", "8967456321");
        e2.calculatePay(25);
        e2.getEmployeeDetails();

    }
}
