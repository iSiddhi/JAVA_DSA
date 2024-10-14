import java.util.*;

public class FunctionParameters {
    public static int  Calculatesum(int num1,int num2){  
        // parameters or formal parameters

        int sum= num1+num2;
        return sum;




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculatesum(a,b);
        // arguements or actual parameters
        System.out.println("sum is "+ sum);



    }
    
}



// returntType name(type para1,type para2){
// body
// retrun statement;}


// actual parameters arguements which is used at the time of calling
// formal parameters = which is used at the time of defination
