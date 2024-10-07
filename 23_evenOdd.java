import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("number is neither odd nor even");
        }if (number%2==0) {
            System.out.println("number is even");
            
        }else{
            System.out.println("number is odd");
        }


    
        
    }
    
}



// 3 odd even
