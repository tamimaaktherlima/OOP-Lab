public class Teacher extends Person {
    String deptName = "CSE";

    void teach(){
        System.out.println("Teaching is novel profession!");
    }

    void display_teacherInfo(){
        System.out.println("Teacher Department: "+deptName);
        System.out.println("Name: "+name);
        super.display_personInfo("Tahmina Rahman",30, 5.5);
        //super("Rahman Ali",58);
    }
}
