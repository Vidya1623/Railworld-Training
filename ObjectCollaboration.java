//School
package Model;

public class School {
  private String SchoolName;
  private String city;
  

    public School(String SchoolName, String city) {
        this.SchoolName = SchoolName;
        this.city = city;
        
    }

    public School() {
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "School{" +
                "SchoolName='" + SchoolName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

//Student
package Model;

public class Student {
  private String StudentName;
  private String Marks;
  

    public Student(String StudentName, String Marks) {
        this.StudentName = StudentName;
        this.Marks = Marks;
        
    }

    public Student() {
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getMarks() {
        return Marks;
    }

    
    

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", Marks='" + Marks + '\'' +
                '}';
    }
}

//StudentDetails
import Model.School;
import Model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school=new School();
        Scanner sc=new Scanner(System.in);
        Student.setName(sc.nextLine());
        Student.setSchool(new School("ABC School","Noida"));
        System.out.println(student.toString());
    }
}
