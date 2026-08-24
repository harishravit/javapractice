package atoz_Striver_DSA.Sorting_I;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int minNum=0;
        for(int i=0;i<arr.length;i++){
            minNum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minNum]>arr[j]){
                    minNum=j;
                }
            }
            int temp=arr[minNum];
            arr[minNum]=arr[i];
            arr[i]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
