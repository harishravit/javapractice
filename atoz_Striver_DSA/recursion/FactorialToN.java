package atoz_Striver_DSA.recursion;

public class FactorialToN {
       static void factorialToN(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        };
        sum=sum*n;
        factorialToN(n-1,sum);
    }
    public static void main(String[] args) {
        factorialToN(5,1);
    }    
}
