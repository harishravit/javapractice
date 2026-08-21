package atoz_Striver_DSA.recursion;

public class PrintNtoOneTimes {
    static void printNtoOneTimes(int n,int count){
        count=n;
        if(n<1) return;
        System.out.print(count+" ");
        printNtoOneTimes(n-1,count-1);
    }
    public static void main(String[] args) {
        printNtoOneTimes(1,0);
    }    
}