package university;

import university.courses.Course;
import university.faculty.Faculty;
import university.students.Student;

public class UniversityMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Narean");
        student.setEmail("narean@gamil.com");
        student.setId(1);
        student.setPhone("1234567890");
        student.setLocation("kalakad");

        Faculty faculty=new Faculty();
        faculty.setId(1);
        faculty.setName("james Gauslin");
        faculty.setEmail("james@gmail.com");
        faculty.setPhone("1478523690");
        faculty.setLocation("Westwood, New Jersey");

        Course course=new Course();
        course.setName("Java");
        course.setDuration("3months");
        course.setPrice("150$");
        course.setFaculty(faculty);

        new UniversityMain().purchaseCourse(student.getName(),course.getName());
    }

    public void purchaseCourse(String sName,String cName){
        System.out.println(cName+" course is purchased by "+sName);
    }
}
