// 19-05-2025
// Author Tamima Akther Lima

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student st = new Student();
        System.out.print("Enter the Name : ");
        st.name = input.nextLine();
        System.out.print("Enter the ID : ");
        st.id = input.nextInt();
        System.out.print("Enter the CGPA : ");
        st.cgpa = input.nextFloat();

//        st . name = "abcde";
//        st . id = 15;
//        st  . cgpa = 3.78f;

        //st.display();
        st.set_value(st.name, st.id, st.cgpa);
        st.display();

        int c = st.getId();
        System.out.println(st.getId());


        Teacher t1 = new Teacher();
//        t1 . name = "abcde";
//        t1 . dept = "CSE";
//        t1  . salary = 33000;
        System.out.print("Enter the Teacher Name : ");
        t1.name = input.next();
        System.out.print("Enter the Department name : ");
        t1.dept = input.next();
        System.out.print("Enter the Salary : ");
        t1.salary = input.nextDouble();

        //t1.display();
        t1.set_value(t1.name, t1.dept, t1.salary);
        t1.display();

        String d = t1.getDepartment();
        System.out.println(d);
        System.out.println(t1.getDepartment());


        Circle c1 = new Circle();
        System.out.print("Enter the radius : ");
        c1.pi = 5.14f;
        c1.radius = input.nextFloat();
        c1.area();
    }
}
