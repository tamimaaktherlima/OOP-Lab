// 12-05-2025
// Author Tamima Akther Lima

public class Main {
    public static void myName(){
        System.out.println("My Name is Tamima Akther Lima");
    }
    public static void myName(String name){
        System.out.println(name);
    }
    public static void myName(String name,int roll){
        System.out.println("\n");
        //System.out.println("This my Name & Roll");
        System.out.println("Name is : "+name);
        System.out.println("Roll is : "+roll);
    }
    static int calculation(int n){
        return 5+n;
    }
    static int calculation(int x, int y){
        int X = x+y;
        return X;
    }
    public static void main(String[] args){
        //int nums = {1,2,3,4,5,6,7,8,9,10}
        //String ar = []
        int sum = 0;
        for(int i=1;i<=10;i++){

            if(i == 5 || i == 6){
                continue;
            }
            if(i == 9){
                break;
            }
            System.out.println(i);

            sum+=i;
        }
        System.out.println("Sum of the numbers is : "+sum);
        int avg = sum/10;
        System.out.println("Average is : "+avg);

        String name = "Tamima Akther Lima";
        int roll = 564;

        myName(name);
        myName();
        myName(name,roll);
        int num = calculation(25);
        System.out.println();
        System.out.println("The number is = "+num);
        System.out.println();
        int result = calculation(50,90);
        System.out.println("Sum of x & y - "+result);
    }
}
