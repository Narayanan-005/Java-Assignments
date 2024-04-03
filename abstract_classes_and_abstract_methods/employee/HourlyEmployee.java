package employee;

public class HourlyEmployee extends Employee {
    static double sal = 85;

    public HourlyEmployee(int i, String aaru, String mail, String number) {
        this.id = i;
        this.name = aaru;
        this.email = mail;
        this.phone = number;
    }

    @Override
    public void calculatePay(int days) {
        salary = sal * 8 * days;
    }
}
