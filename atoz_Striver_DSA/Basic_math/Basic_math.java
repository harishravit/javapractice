package atoz_Striver_DSA.Basic_math;

import java.util.*;

public class Basic_math {
    static int reverseNumber(int n){
        int s=0;
        while (n>0) {   
            int ls=n%10;
            s=s*10+ls;
            n/=10;
        }
        return s;
    }
    static boolean palindromeNumber(int n){
        int s=0;
        int temp=n;
        while (temp>0) {   
            int ls=temp%10;
            s=s*10+ls;
            temp/=10;
        }
        return n==s?true:false;
    }
    static int findGcd(int num1,int num2){
        int storeGcd=1;
        for(int i=1;i<=Math.min(num1, num2);i++){
            if(num1%i==0&&num2%i==0){
                storeGcd=i;
            }
        }
        return storeGcd;
    }
    static boolean armstrongNumber(int n){
        int sum=0;
        String getLength=String.valueOf(n);
        int len=getLength.length();
        int temp=n;
        while (temp>0) {
            int ls=temp%10;
            int fact=1;
            for(int i=1;i<=len;i++){
                fact*=ls;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==n) return true;
        return false;
    }
    static List<Integer> printAllDivisors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) list.add(i);
        }
        return list;
    }
    static boolean primeOrNot(int n){
        if(n<=1) return false;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        return count==2;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
        System.out.println(palindromeNumber(7789));
        System.out.println(findGcd(7,13));
        System.out.println(armstrongNumber(140));
        System.out.println(printAllDivisors(12));
        System.out.println(primeOrNot(10));
    }
}
