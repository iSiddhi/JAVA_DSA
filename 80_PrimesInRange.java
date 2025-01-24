public class primesinRange {
    public static boolean IsPrime(int n){
        boolean IsPrime= true;
        for(int i = 2;i<=n-1;i++){
            if (n%i==0) {
                IsPrime = false;;
                
            }

        }
        return IsPrime;
    }


    public static void primesinRange(int n){
        // boolean  isPrime= true;

        for(int i=2;i<=n;i++){

            if (IsPrime(i)) {
                System.out.println(i+" ");
                
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
         primesinRange(20);
        
    }
    
}
