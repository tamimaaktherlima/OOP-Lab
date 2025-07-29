public class ThrowsException {

    //  Throw Exception.
//    public static void check(int n){
//        if(n < 0){
//            throw new ArithmeticException("Negative number not allowed");
//
//        }
//        System.out.println("welcome, It's positive number");
//    }
//
//    public static void main(String[] args) {
//        check(20);
//    }
//    public static void main(String[] args) {
//        int number = -10;
//        try{
//            if(number < 0){
//                throw new ArithmeticException("Negative number");
//
//            }
//            System.out.println("Number :");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//    }


    // Throws Exception.
    static void check(int age) throws Exception{
        if(age < 18){
            throw new Exception("Age less than 18");
        }
        System.out.println("Access granted");

    }

    public static void main(String[] args) {
        try{
            check(16);
        }catch (Exception e){
            System.out.println("Errors : " + e.getMessage());
        }
    }
}
