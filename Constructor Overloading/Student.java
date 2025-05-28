public class Student {
    //    private String id;
    //    private String name;
    //    private double cgpa;

    public String id;
    public String name;
    public double cgpa;

    Student(){
        System.out.println("\n"+"Object Created.... No information!!"+"\n");
    }

    Student(String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    Student(String id){
        this.id = id;
    }

    public void insert_Record(String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public void display(){
        System.out.println("\n"+"Name : "+name+"\n"+"ID : "+id+"\n"+"CGPA : "+cgpa+"\n");
    }
}
