package Passbyvalueandref;
public class pass_by_value_ref {
    static void modifyRef(int[] num){
        System.out.println("address of num = "+num);
        num[0]=10;
    }
    static int modifyValue(int b){
        b=90;
       return b; 
    }  
    public static void main(String[] args) {
        int a=10;
        int[] b={1,2,3};
        System.out.println("address of b = "+b);
        modifyRef(b);
        System.out.println(b[0]);
        a=modifyValue(a);
        System.out.println(a);

    }
}
