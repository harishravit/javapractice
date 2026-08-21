package atoz_Striver_DSA.recursion;

public class SumOfNnumbers {
       static void sumOfNnumbers(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        };
        sum=sum+n;
        sumOfNnumbers(n-1,sum);
    }
    public static void main(String[] args) {
        sumOfNnumbers(6,0);
    }    
}
