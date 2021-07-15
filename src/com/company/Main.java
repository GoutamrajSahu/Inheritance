package com.company;


//class Animal{
//    Animal(){
//        System.out.println("Its an animal,");
//    }
//}
//class Cat extends Animal {
//    Cat() {
//        System.out.println("Who is my mother Cat,");
//    }
//}
//class babyCat extends Cat{
//        babyCat(){
//            System.out.println("And i am a BabyCat,Meooo...");
//        }
//}
//public class Main {
//
//    public static void main(String[] args) {
//	  babyCat ob = new babyCat();
//    }
//}


//class Animal{
//    Animal(){
//        System.out.println("I am an animal,");
//    }
//}
//class Cat extends Animal {
//    Cat() {
//        System.out.println("And I sounds like Bhaooo..., and also I Hate Cats. \n ");
//    }
//}
//class Dog extends Animal{
//    Dog(){
//        System.out.println("And I sounds like Meooo..., and also I Hate Dogs. ");
//    }
//}
//public class Main {
//
//    public static void main(String[] args) {
//        Cat CAT = new Cat();
//        Dog DOG = new Dog();
//    }
//}

//class Animal{
//    void Details(){
//        System.out.println("I am an animal,");
//    }
//}
//class Dog extends Animal {
//   void Details() {
//        super.Details();
//        System.out.println("I sounds like Bhaooo..., and also I Hate Cats.");
//    }
//}
//public class Main {
//
//    public static void main(String[] args) {
//        Animal DOG = new Dog();
//        DOG.Details();
//        Dog dog = (Dog) DOG;
//        dog.Details();
//    }
//}


class Animal{
    void Details(){
        System.out.println("I am an animal,");
    }
}
class Dog extends Animal {
    void Details() {
        System.out.println("I sounds like Bhaooo..., and also I Hate Cats.");
    }
}
public class Main {

    public static void main(String[] args) {
        Animal DOG = new Dog();
        DOG.Details();
        Dog dog = (Dog) DOG;
        dog.Details();
    }
}