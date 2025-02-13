public class multipleHeritance {
    public static void main(String[] args) {

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        
    }
    
}


class Animal{

    void eat(){
        System.out.println("eating...");}
    
    }

class Mammals extends Animal{
    int legs;
    }
class Dog extends  Mammals{
    void breed(){
        System.out.println("husky");
    }
}


