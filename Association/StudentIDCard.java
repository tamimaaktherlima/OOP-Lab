public class StudentIDCard {
   int cardNumber;
   Student owner; // object reference / part class

   StudentIDCard(int cardNumber, Student owner){
       this.cardNumber = cardNumber;
       this.owner = owner;
   }

   void displayCardInfo(){
       System.out.println("Card Number: " + cardNumber);
       System.out.println("Owner Name: " + owner.name);
       System.out.println("Owner Student ID: " + owner.studentId);
   }


//    Given problem solve
    int cardNumber;
//    Student owner;

    StudentIDCard(int cardNumber){
        this.cardNumber = cardNumber;
//        this.owner = owner;
    }

    void displayCardInfo(){
        System.out.println("Card Number is: " + cardNumber);
//        System.out.println("Owner Name: "+ owner.name);
//        System.out.println("Owner Student ID: "+ owner.studentID);
    }
}