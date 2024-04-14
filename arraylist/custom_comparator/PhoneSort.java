package custom_comparator;

import java.util.Comparator;

public class PhoneSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getPhoneNo()-o2.getPhoneNo());
    }
}
