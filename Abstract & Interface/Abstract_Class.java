// 08-07-2025
// Author Tamima Akther Lima

abstract class Abstract_Class {
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Pig extends Abstract_Class{
    public void animalSound(){
        System.out.println("The pig says: hi");
    }
}

//class Main{
//    public static void main(String[] args) {
//        Abstract_Class a1 = new Abstract_Class() {
//            @Override
//            public void animalSound() {
//
//            }
//        }
//    }
