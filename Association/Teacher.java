import java.util.ArrayList;
import java.util.List;

public class Teacher {
    // For One to One
   String teacherName;
   int employID;
   Student student;

   Teacher(String teacherName, int employID , Student student){
       this. teacherName = teacherName;
       this.employID = employID;
       this.student = student;
   }

   void displayInfo(){
       System.out.println("Teacher Name: " + teacherName);
       System.out.println("Teacher EmployID: " + employID + "\n");
       System.out.println("Student Name: " + student.name);
       System.out.println("Student StudentID: " + student.studentId);
   }

    // For Many to one
   String teacherName;
   int employID;
   String subject;
   Student student;

   Teacher(String teacherName, int employID ,String subject){
       this. teacherName = teacherName;
       this.employID = employID;
//        this.student = student;
       this.subject = subject;
   }

   void displayInfo() {
       System.out.println("Teacher Name: " + teacherName);
       System.out.println("Teacher EmployID: " + employID + "\n");
//        System.out.println("Student Name: " + student.name);
//        System.out.println("Student StudentID: " + student.studentId);
       System.out.println("Teacher Subject: " + subject);
   }


    // For Many to Many
   String teacherName;
   int employID;
   String subject;
   List<Student>students;

   Teacher(String teacherName, int employID ,String subject){
       this. teacherName = teacherName;
       this.employID = employID;
       this.subject = subject;
       this.students = new ArrayList<>();
   }

   void addStudents(Student newStudent) {
       students.add(newStudent);
   }

   void displayInfo() {
       System.out.println("Teacher Name: " + teacherName);
       System.out.println("Teacher EmployID: " + employID);
       System.out.println("Teacher Subject: " + subject);
       System.out.println("----- Student ------");

       for(Student s : students) {
           System.out.println("Student Name: " + s.name +"\n" + "Student StudentID: " + s.studentId);
       }
       System.out.println();
   }
}