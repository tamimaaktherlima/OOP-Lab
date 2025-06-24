import java.util.ArrayList;
import java.util.List;

public class Student {
   String name;
   int studentId;

   Student(String name, int studentId){
       this.name = name;
       this.studentId = studentId;
   }


    // One to Many
   String name;
   int studentId;
//    List<Teacher>teachers;
   Teacher teacher;

   Student(String name, int studentId, Teacher teacher){
       this.name = name;
       this.studentId = studentId;
       this.teacher = teacher;
   }

   void displayStudentInfo(){
       System.out.println("Student Name: " + name);
       System.out.println("Student ID: " + studentId);
       System.out.println("Teacher Name: " + teacher.teacherName);
       System.out.println("Teacher EmployeID: " + teacher.employID);
       System.out.println("Teacher Subject: "+ teacher.subject);
       System.out.println();
   }


    // Many to Many
   String name;
   int studentId;
   List<Teacher>teachers;

   Student(String name, int studentId){
       this.name = name;
       this.studentId = studentId;
       this.teachers = new ArrayList<>();
   }

   void addTeaches(Teacher newTeacher){
       teachers.add(newTeacher);
   }

   void displayStudentInfo(){
       System.out.println("Student Name: " + name);
       System.out.println("Student ID: " + studentId);
       System.out.println("-------- Teacher ---------");
       for(Teacher t : teachers){
           System.out.println("Teacher Name: " + t.teacherName +"\n"+ "Teacher EmployeID: " + t.employID +"\n"+ "Teacher Subject: "+ t.subject);
       }
       System.out.println();
   }

//  Given problem solve
    String name;
    int studentID;
    StudentIDCard stuIDCard;

    Student(String name, int studentID, StudentIDCard stuIDCard){
        this.name = name;
        this.studentID = studentID;
        this.stuIDCard = stuIDCard;
    }

    void display(){
        System.out.println("Card Number is: " + stuIDCard.cardNumber);
        System.out.println("Owner Name: "+ name);
        System.out.println("Owner Student ID: "+ studentID);
    }
}