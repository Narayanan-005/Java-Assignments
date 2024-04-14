package custom_comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(2,"Aaru","aaru@gmail.com",8529631230l,"ayakudi"));
        list.add(new Student(1,"narean","narean@gmail.com",7894561230l,"kalakad"));
        list.add(new Student(3,"santhosh","santhosh@gmail.com",9874561230l,"tirunelveli"));
//        list.sort(new IdSort());
//        list.sort(new NameSort());
//        list.sort(new PhoneSort());
        System.out.println(list);
    }
}
