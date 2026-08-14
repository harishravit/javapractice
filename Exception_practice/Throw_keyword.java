package Exception_practice;

import java.util.Scanner;

public class Throw_keyword {
    public static void main(String[] args) {
        Scanner getInputFromUser=new Scanner(System.in);
        System.out.println("Enter value");
        int getValue=getInputFromUser.nextInt();
        System.out.println("Enter Divider");
        int getDivider=getInputFromUser.nextInt();
        if(getDivider==0){
            getInputFromUser.close();
            throw new ArithmeticException("Can't divide the number ("+getValue+") by zero ");
        }
        int result=getValue/getDivider;
        System.out.println("----------------");
        System.out.println("result = "+result);
        getInputFromUser.close();
    }
}