// 19-05-2025
// Author Tamima Akther Lima

public class Teacher {
    String name;
    String dept;
    double salary;

    void display(){
        System.out.println("Name : "+this.name +"\n"+"Department : "+this.dept+"\n"+"Salary : "+this.salary);
    }

    void set_value(String name, String dept, double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String  getDepartment(){
        return this.dept;
    }
//    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.set_value("Tamima", "CSE", 25000);
//        t1.display();
//
//    }
}
