package atoz_Striver_DSA.recursion;

public class ReverseArray {
    static int[] reverseArray(int[] arr,int[] result,int end,int start){
        if(end<0){
            return result;
        }
        result[start]=arr[end];
        reverseArray(arr,result, end-1, start+1);
        return result;
    }
    public static void main(String[] args) {
        int[] a={};
        int[] aa=new int[a.length];
        int[] b=reverseArray(a,aa ,a.length-1,0);
        for(int c:b){
            System.out.print(c+" ");
        }
    }
}
