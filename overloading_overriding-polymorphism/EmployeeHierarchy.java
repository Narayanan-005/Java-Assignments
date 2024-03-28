public class EmployeeHierarchy{
    public static void main(String[]args){
        Employee e1=new SalariedEmployee(1,"Aaru","Aaru@gmail.com","8967456321");
        e1.getEmployeeDetails();
    }
}
abstract class Employee{
    int id;
    String name;
    String email;
    String phone;
    abstract public void getEmployeeDetails();
}
class HourlyEmployee extends Employee{
    static String salary="Rs85/hr";
    HourlyEmployee(int id,String name,String email,String phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Type Hourly Employee");
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Email:"+email);
        System.out.println("Employee Phone:"+phone);
        System.out.println("Employee Salary:"+salary);
    }
}
class SalariedEmployee extends Employee{
    static String salary="Rs18,600/month";
    SalariedEmployee(int id,String name,String email,String phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Type Salary Employee");
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Email:"+email);
        System.out.println("Employee Phone:"+phone);
        System.out.println("Employee Salary:"+salary);
    }
}
