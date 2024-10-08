import java.util.Scanner;

public class passorfaill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = sc.nextInt();
        String reportCard = marks>=33? "Pass": " Fail";
        System.out.println(reportCard);



        
    }
    
}
