import java.util.Scanner;

public class whileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int i =1;
        int sum=0;
        while (i<=number) {
            sum+=i;
            i++;
            
        }
        System.out.println(sum);
        }
    
}
