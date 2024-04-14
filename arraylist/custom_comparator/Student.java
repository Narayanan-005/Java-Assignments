package custom_comparator;

public class Student {
    private int id;
    private String name;
    private String email;
    private long phoneNo;
    private String location;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public Student(int id, String name, String email, long phoneNo, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", location='" + location + '\'' +
                '}';
    }
}
