//compare marks of student using comparable conditions are if marks are higher than print high if marks are less than less if marks are equal print equal
package Interface;

import java.io.Serializable;

public class Student implements Trial,Serializable,Comparable<Student>{
    private int marks;
    private String name;

    public Student() {
    }

    public Student(int marks,String name){
        this.marks=marks;
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public int showMarks(){
        return marks;
    }

    @Override
    public int compareTo(Student student) {
    if(marks<0){
        System.out.println("High");
    }
    else if(marks>0){
        System.out.println("Low");
    }
    else{
        System.out.println("Equals");
    }
    
    }
}
    
    