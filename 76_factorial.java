public class factoriall {


    public static int factorial(int n){
        int f=1;
        // int i= 1;
        for(int i = 1;i<=n;i++){
            f=f*i;


        }
        return f;

    }

    public static void main(String[] args) {

        int fac = factorial(4);
        int n = 4;
        System.out.println("fact of 4" + fac);

        
    }
    
}
