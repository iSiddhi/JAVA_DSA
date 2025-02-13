public class singleLevel {
    
    public static void main(String[] args) {

        Dog husky = new Dog();
        husky.eat();
        husky.bark();
        
    }
}

class Animal{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(" barking....");

   }
}


