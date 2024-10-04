import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float radius= sc.nextFloat();
        Float Area = (22/7)*(radius*radius);
        System.out.println(Area);
    }
    
}
