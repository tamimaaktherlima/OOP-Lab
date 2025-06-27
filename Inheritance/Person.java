public class Person {
    String name;
    int age;
    double height;
//    String name = "lima";
//    int age = 20;

    void teach(){
        System.out.println("Human Being");
    }

    void display_personInfo(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
//        System.out.println("Person Name: " + name + "\n" + "Person Age: " + age + "\n" + "Person Height: "+height);
        System.out.println("Person Name: " + name + "\n" + "Person Age: " + age + "\n" + "Person Height: "+height);
    }

//    void display_personInfo(){
//        System.out.println("Person Name: "+ name +"\n"+ "Person Age: "+age);
//    }
}
