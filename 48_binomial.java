public class binomial {
    public static int factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        return f;

    }
    public static int BinCoeff(int n,int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);

        int binCoeff= fact_n/(fact_r*fact_nmr);
        return binCoeff;

        

    }
    public static void main(String[] args) {
       System.out.println(BinCoeff(5,2));
    }
    
}
