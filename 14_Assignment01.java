

/*Question 1
// In aprogram,input3numbers:A,BandC.Youhavetooutputtheaverageof
// these 3 numbers.

public class Assignment {
    public static void main(String[] args) {
        int A=20;
        int B= 30;
        int C = 40;
        float Average = (A+B+C)/3;
        System.out.println(Average);

    }
    
}


/*  Question 2
 Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthe
square. */

// public class Assignment{
//     public static void main(String[] args) {
//         int side= 10;
//        int  Area = side* side;
//        System.out.println(Area);

//     }
// }

// Question3

import java.util.Scanner;

public class Assignment {

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // prices of product= product name 
        System.out.println("enter the cost of pencil");;
        float pencil = sc.nextFloat();
        System.out.println("enter the cost of pen");
        float pen = sc.nextFloat();
        System.out.println("enter the cost of eraser");
        float eraser = sc.nextFloat();
        float total_cost= pen+pencil+eraser;
        float bill_with_GST= total_cost + (0.18f*total_cost);
        System.out.println(total_cost);
        System.out.println(bill_with_GST);
     }
}


