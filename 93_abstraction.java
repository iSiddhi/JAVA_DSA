

public class Abstraction {
    
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        
    }
}
abstract  class Animal{
    void eat(){
        System.out.println("animal eats ");
    }
    abstract  void walk();


}

class Horse extends  Animal{
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Chicken extends  Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
}
