package employee;

public class SalariedEmployee extends Employee {
    static double sal = 800;

    public SalariedEmployee(int i, String aaru, String mail, String number) {
        this.id = i;
        this.name = aaru;
        this.email = mail;
        this.phone = number;
    }

    @Override
    public void calculatePay(int days) {
        salary = sal * days;
    }
}
