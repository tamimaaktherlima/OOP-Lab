// 27-05-2025
// Author Tamima Akther Lima
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student st = new Student();
        System.out.print("Enter your name : ");
        st.name = input.nextLine();
        System.out.print("Enter your Id : ");
        st.id = input. nextLine();
        System.out.print("Enter your CGPA : ");
        st.cgpa = input.nextDouble();
//        st.insert_Record("Tamima", "241-15-564",3.87);
        st.insert_Record(st.name, st.id,st.cgpa);
        st.display();

//        Student st1 = new Student("Lima", "241-15-564",3.87);
        Student st1 = new Student("Lima", "241-15-564",3.87);
        st1.display();
        Student st2 = new Student("241-15-564");
        st2.display();
    }
}
