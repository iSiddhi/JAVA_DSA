public class hierarchial {
    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.breathe();
        Bird sparrow = new Bird();
        sparrow.eats();
        
    }
    
}
class Animal{
    void eats(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathe...");
    }
}

class Fish extends  Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Mammals extends Animal{
    void walks(){
        System.out.println("walking");
    }
}
class Bird extends  Animal{
    void fly(){
        System.out.println("flying");
    }
}