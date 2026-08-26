package atoz_Striver_DSA.Sorting_II;
import java.util.ArrayList;
public class Merge_Sort {
    static int[] mergeSort(int[] arr,int leftIndex,int rightIndex){
        if(leftIndex>=rightIndex) return arr;
        int middleIndex=(leftIndex+rightIndex)/2;
        mergeSort(arr, leftIndex, middleIndex); //left half
        mergeSort(arr, middleIndex+1, rightIndex); //right half
        int[] result=mergeArray(arr, leftIndex, middleIndex,rightIndex); //merge half arrays into single array.
        return result;
    }
    static int[] mergeArray(int[] arr,int leftIndex,int middleIndex,int rightIndex){
      int leftPointer=leftIndex;
      int rightPointer=middleIndex+1;
      ArrayList<Integer> tempArray=new ArrayList<>();
      while(leftPointer<=middleIndex&&rightPointer<=rightIndex){
        if(arr[leftPointer]<=arr[rightPointer])
            tempArray.add(arr[leftPointer++]);
        else
            tempArray.add(arr[rightPointer++]);
      }
      while(leftPointer<=middleIndex){
        tempArray.add(arr[leftPointer++]);
      }
      while(rightPointer<=rightIndex){
        tempArray.add(arr[rightPointer++]);
      }
      for(int i=leftIndex;i<=rightIndex;i++){
        arr[i]=tempArray.get(i-leftIndex);
      }
      return arr;
    }
    public static void main(String[] args) {
        int[] arr={};
        long startTime=System.currentTimeMillis();
       int[] a= mergeSort(arr,0,arr.length-1);
       for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
       }
       System.out.println();
        long endTime = System.currentTimeMillis();
        long durationMs = endTime - startTime;
        System.out.println("Execution Time: " + durationMs + " ms");
    }
}
