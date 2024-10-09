import java.util.Scanner;

public class basicwhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
       int  i=0;
       while (i<=number) {
        System.out.println(i);
        i++;
        
       }
        System.out.println("hence code it is ");
    }
    
}
