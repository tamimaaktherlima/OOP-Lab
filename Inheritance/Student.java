public class Student extends Teacher {
//public class Student extends  Person{
//    from Parent class already we can access name & age
//    String name;
//    int age;
//    String deptName ;

    void teach (){
        System.out.println("When you will become a Teacher, everyone show you respect .");
    }

    void display_studentInfo(String name, int age){
        //System.out.println("Student Name: "+name+"\n"+"Student Age: "+age);

//        Eikhane this keyword use korar fole parent theke asha instance variable er o same value set hocche ... that's why parent & child same value display kortese.
//        this.name = name;
//        this.age = age

//        shudhu eikhanei value set hobe .... ekhane parent r child er value different show korbe...
        name = name;
        age= age;
//        System.out.println("Student Name: "+name+"\n"+"Student Age: "+age +"\n"+"Student department: "+super.deptName);
        System.out.println("Student Name: "+name+"\n"+"Student Age: "+age +"\n");
//        super.display_personInfo(name,age);
        //super.display_personInfo();
        System.out.println("Department Name: "+super.deptName);
        super.teach();
        //teach();
    }
}
