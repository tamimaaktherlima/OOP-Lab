public class Main {
    public static void main(String[] args) {
        // For One to One ---- Aggregation
       Student st = new Student("Lima", 241);
       StudentIDCard stID = new StudentIDCard(564, st);

       stID.displayCardInfo();

       Student s1 = new Student("Lima Akther", 564);
       Teacher t1 = new Teacher("Tasnuva Rahman", 24513065, s1);

       t1.displayInfo();



        // For One to Many
       Teacher t1 = new Teacher("Ms. Nusaiba Ashik", 235410150, "CSE");

       Student s1 = new Student("Tamima", 564, t1);
       Student s2 = new Student("Lima", 465, t1);
       Student s3 = new Student("Habib", 456, t1);

       s1.displayStudentInfo();
       s2.displayStudentInfo();
       s3.displayStudentInfo();


        // For Many to Many
       Teacher t1 = new Teacher("Habibur Bashar", 25410230, "OOP");
       Teacher t2 = new Teacher("Natasha Rahman", 26781002, "Algorithms");
       Teacher t3 = new Teacher("Ashfaque Nipun", 10014520, "Data Structure");

       Student s1 = new Student("Lima", 564);
       Student s2 = new Student("Tamima", 249);
       Student s3 = new Student("Ashak", 306);

       t1.addStudents(s1);
       //t1.displayInfo();

       t1.addStudents(s2);
       //t1.displayInfo();

       t1.addStudents(s3);
       t1.displayInfo();

       s1.addTeaches(t1);
       //s1.displayStudentInfo();

       s1.addTeaches(t2);
       //s1.displayStudentInfo();

       s1.addTeaches(t3);
       s1.displayStudentInfo();

//        t1.displayInfo();
//        t2.displayInfo();
//        t3.displayInfo();

//        s1.displayStudentInfo();
//        s2.displayStudentInfo();
//        s3.displayStudentInfo();


        // For given problem solution
        StudentIDCard stID = new StudentIDCard(201050);
        Student st = new Student("Tamima Akther Lima", 564, stID);

        st.display();
    }

}
