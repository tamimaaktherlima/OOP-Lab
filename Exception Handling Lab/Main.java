// 22-07-2025
// Author Tamima Akther Lima

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        NegativeArrayIndex Exception
        int size;
        System.out.println("Enter the products size: ");

        size = input.nextInt();
        try{
            int[] products = new int[size];
            System.out.println("Product size " + size + " is created");
        }catch (NegativeArraySizeException e){
            System.out.println(e);
            System.out.println("Errors! You can not access negaative index in the products. ");
        }

//        NullPointer Exception
       String s ;
       System.out.println("Enter the String Name: ");
       s = input.nextLine();

       try{
           System.out.println("Contact Name: " + s.toUpperCase(Locale.ROOT));
       }catch (NullPointerException e){
           System.out.println(e);
           System.out.println("Errors ! Name can not found");
       }


//        Arithmatic Exception
       System.out.println("Enter the numerator: ");
       int a = input.nextInt();

       System.out.println("Enter the denominator: ");
       int b = input.nextInt();

       try{
           int data = a / b;
//            System.out.println(data);

       }
       catch (ArithmeticException e){
           System.out.println("Cannot divide by Zero");
       }


//        ArrayIndexOfBounds Exception
       int[] arr = {70, 90, 82, 75, 87};
       try{
//            System.out.println(arr[6]);
           int k = 1;
           for(int i=0;i<=5;i++){
               System.out.println("Subject " + k + ":" + arr[i]);
               k++;
           }

       }catch (ArrayIndexOutOfBoundsException e ){
           System.out.println(e);
           System.out.println("Errors!");
       }


    }
}