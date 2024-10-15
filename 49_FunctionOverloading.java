public class functionOverloading {

    // function to calculate the sum oƒtwo numbers
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b, int c){
        return a +b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3, 6, 7));
    }
    
    




    
}


// functionoverloading only depends on  parameters



