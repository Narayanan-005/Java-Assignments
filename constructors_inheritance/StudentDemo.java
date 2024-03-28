class StudentDemo {
    public static void main(String[] args) {
        ZSGSStudent zsgsStudent=new Student("Aaru");//error: incompatible types: Student cannot be converted to ZSGSStudent
    }
}

class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
}
class ZSGSStudent extends Student{
    int id;
    String location;
    public ZSGSStudent(int id,String name,String location){
        super(name);
        this.id=id;
        this.location=location;
    }
}
