package atoz_Striver_DSA.recursion;

public class PrintOneToN {
    static void printOneToN(int n,int count){
        if(n==0) return;
        System.out.print(count+" ");
        printOneToN(n-1,count+1);
    }
    public static void main(String[] args) {
        printOneToN(4,1);
    }    
}