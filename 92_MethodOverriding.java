public class MethodOver {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // calc.sum(5, 5,7);
        System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum(2.5, 7.9));

        // System.out.println(2,3,4);
        
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a+b;

    }

    float sum(float a , float b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return  a +b+c;
    }
}
