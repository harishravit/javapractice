package atoz_Striver_DSA.hashing;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Count array elements frequency 
 */
public class CountArrEleFreq {
    // static void findArrFreqUsingBooleanArray(int[] arr){
    //     // using array;
    //     boolean [] visited=new boolean[arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         if(visited[i]) continue;
    //         int count=1;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             visited[j]=true;
    //             }
    //         }
    //         System.out.println(arr[i]+" "+count);
    //     }
    // }
    static void findArrEleFreqUsingHashMap(int[] arr){
        Map<Integer,Integer> freqMap=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(freqMap.containsKey(arr[i])){
                count=freqMap.get(arr[i]);
            }
            freqMap.put(arr[i], count+1);
        }
        
        freqMap.forEach((k,v)->{
            System.out.println(k+"="+v);
        });
    }
    public static void main(String[] args) {
        int [] arr={10,5,10,15,10,5};
        // findArrFreqUsingBooleanArray(arr);
        findArrEleFreqUsingHashMap(arr);
    }
}