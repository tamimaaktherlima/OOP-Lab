// 19-05-2025
// Author Tamima Akther Lima

public class Student {
    int id;
    String name;
    float cgpa;

    void display(){
        System.out.println("My Id is : "+this.id +"\n" +"My name is : " +this.name +"\n" +"CGPA is : "+this.cgpa);
    }

//    value Assign kora
    void set_value(String name, int id, float cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    int getId(){
        return this.id;
    }

//    public static void main(String[] args) {
//        Demo st = new Demo();
////        st.id = 10;
////        st.name = "Lima";
////        st.cgpa = 3.78f;
//        st.set_value("Tamima", 564, 3.78f);
//        //st.display();
//        st.getId();
//    }
}