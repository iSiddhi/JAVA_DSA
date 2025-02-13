public class Overriding {
    
    public static void main(String[] args) {
        Deer dogii=  new Deer();
        dogii.eat();
        
    }
    
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
    
    }
class Deer extends  Animal{
    void  eat(){
        System.out.println("only eats grass");
    }
}
