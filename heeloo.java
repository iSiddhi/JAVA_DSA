public class heeloo {
  
        public static void main(String[] args) {
            Fish whale = new Fish();
            whale.breathe();
            whale.eats();
            whale.swim();
    
            Bird sparrow = new Bird();
            sparrow.breathe();
            sparrow.eats();
            sparrow.fly();
    
            Mammals human = new Mammals();
            human.breathe();
            human.eats();
            human.walks();
        }
    }
    
    class Animal {
        void eats() {
            System.out.println("eating");
        }
    
        void breathe() {
            System.out.println("breathing...");
        }
    }
    
    class Fish extends Animal {
        void swim() {
            System.out.println("swimming");
        }
    }
    
    class Mammals extends Animal {
        void walks() {
            System.out.println("walking");
        }
    }
    
    class Bird extends Animal {
        void fly() {
            System.out.println("flying");
        }
    }
    
    

