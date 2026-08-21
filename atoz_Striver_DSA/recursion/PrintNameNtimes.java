package atoz_Striver_DSA.recursion;

public class PrintNameNtimes {
    static void printNameNtimes(int n)
    {
        if(n==0) return;
        System.out.print("Harish R"+" ");
        printNameNtimes(n-1);
    }
    public static void main(String[] args) {
        printNameNtimes(1);
    }
}
