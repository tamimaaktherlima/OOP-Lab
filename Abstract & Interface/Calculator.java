public class Calculator {

    void addTwoNumber(int a, int b){
        int c = a + b;
        System.out.println("Sum of two number : " + c);
    }

    void addThreeNumber(int a, int b, int c){
        int d = a + b + c;
        System.out.println("Sum of three number : "+d);
    }

    void addNumber(double a, double b){
        double c = a + b;
        System.out.println("Sum of tow double values : "+c);
    }

    void addString(int a, String s){
        int b = Integer.parseInt(s);
        int c = a + b;
        System.out.println("Sum of String & Integer : "+c);
    }

}

