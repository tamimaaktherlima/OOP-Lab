// import java.sql.Array;
// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

       c1.addTwoNumber(10, 60);
//        c1.addThreeNumber(20,50,90);
//        c1.addNumber(45.5, 27.7);
//        c1.addString(50, "10");
//
//
//        Vehicle v1 = new Vehicle();
//
//        Car c2 = new Car();
//        Motorcycle m1 = new Motorcycle();
//
//        v1.startEngine();
//        c2.startEngine();
//        m1.startEngine();


        FireAlert f1 = new FireAlert();
//        FireAlert f2 = new FireAlert();

        SecurityAlert s1 = new SecurityAlert();
//        SecurityAlert s2 = new SecurityAlert();


       Alert []array = new Alert[5];
//        for(int i = 0; i<array.length; i++){
//            array.add(f1);
//            array.add(s1);
//        }
        array[0] = f1;
        array[1] = s1;
        for(Alert s : array){
//            System.out.println(s);
            s.triggerAlert();
            s.logAlert();
        }

    }
}
