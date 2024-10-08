import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int number1 = sc.nextInt();
        System.out.println("enter second number ");
        int number2= sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(number1+number2);
            break;
            case '-' : System.out.println(number1-number2);
            break;
            case '*' : System.out.println(number1 * number2);
            break;
            default: System.out.println("invalid operator");


        }



    }
    
}
