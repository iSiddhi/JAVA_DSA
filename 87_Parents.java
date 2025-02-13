public class Parents {
    public static void main(String[] args) {
        Parent father= new Parent();
        father.color();
        
    }
    
}

class Grandparents{
    int age;
    void color(){
        System.out.println("fair");
    }
}
class Parent extends Grandparents{
    int money;
    void chac(){
        System.out.println("blue eyes");
    }
}
