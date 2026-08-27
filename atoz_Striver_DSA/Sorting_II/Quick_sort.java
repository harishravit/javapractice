package atoz_Striver_DSA.Sorting_II;
/*
    1.compare start value less than end value.
    2.get privot element index.
    3.call main sorting function again inside if block for left half array (Recurision method).
    4.call main sorting function again inside if block for right half array (Recurision method).
    5.repeat the process.
 */
class QuickSort{
    static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int getPivotElementIdx=findPivotElement(arr,start,end);
            quickSort(arr,start,getPivotElementIdx-1);
            quickSort(arr,getPivotElementIdx+1,end);
        }
    }
    static int findPivotElement(int[] arr,int start,int end){
        int getPivotElement=arr[end];
        int startIndex=start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<=getPivotElement){
                startIndex++;
                int getTempElement=arr[startIndex];
                arr[startIndex]=arr[i];
                arr[i]=getTempElement;

            }
        }
        int temp=arr[startIndex+1];
        arr[startIndex+1]=arr[end];
        arr[end]=temp;
        return startIndex+1;
    }
    public static void main(String[] args) {
        int[] arr={10,7,5,8,9,1};
        quickSort(arr, 0, arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}