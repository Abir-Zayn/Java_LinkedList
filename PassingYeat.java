/* Question: Store and print student name,course,passing year by using class,linked list.
*/


import java.util.ArrayList;
import java.util.List;

class student{
    private String name;
    private int year;
    private String course;

    student(String name, int year, String course) {
        this.name = name;
        this.year = year;
        this.course = course;
    }

    public void displayAll(){
        System.out.println("Name: "+name);
        System.out.println("Passing Year: "+year);
        System.out.println("Course: "+course);
    }
}

class school{

    public List<student>students;
    school(){
        System.out.println("Passing Completed.");
        this.students=new ArrayList<student>();
    }
}

public class PassingYeat {
    public static void main(String[] args) {
        school sc=new school();
        student s1=new student("Karim",2020,"SSC");
        student s2=new student("Akbor",2018,"HSC");
        student s3=new student("Rahim",2018,"HSC");
        student s4=new student("Miskat",2020,"SSC");

        sc.students.add(s1);
        sc.students.add(s2);
        sc.students.add(s3);
        sc.students.add(s4);

        for(student stu:sc.students){
            System.out.println("________");
            stu.displayAll();
        }

    }
}
