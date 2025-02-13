

public class Inherit {
    public static void main(String[] args) {
        Brand Audi= new Brand();
            Audi.color();
        }
        
    }
    


class Cars{
    String name;
    void color(){
        System.out.println("red");
    }
    void model(){
        System.out.println("Q7");
    


    }
}

class Brand extends Cars{
    int doors;

    void  speed(){
        System.out.println( "229");
    }

}
