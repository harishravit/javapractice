package atoz_Striver_DSA.Hashing;
import java.util.*;

public class FindHiighAndLow {
    static void findHighAndLowFrq(int[] arr){
    HashMap<Integer,Integer> hash=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int count=0;
        int key=arr[i];
        if(hash.containsKey(key)){
            count=hash.get(key);
        }
        hash.put(key, count+1);
    }
    System.out.println(hash);
    int max=0;
    int min=0;
    int maxEle=0;
    int minEle=0;
    boolean firtTime=true;
    for(Map.Entry<Integer,Integer> hasEntry:hash.entrySet()){
        if(firtTime){
            max=hasEntry.getValue();
            min=hasEntry.getValue();
            minEle=hasEntry.getKey();
            maxEle=hasEntry.getKey();
            firtTime=false;
        }
        else{
            if(max<hasEntry.getValue()){
                max=hasEntry.getValue();
                maxEle=hasEntry.getKey();
            }
            if(min>hasEntry.getValue()){
                minEle=hasEntry.getKey();
                min=hasEntry.getValue();
            }
        }
    }
    System.out.println("maxEle = "+maxEle+" \n"+"minEle = "+minEle);
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,2};
        findHighAndLowFrq(arr);
    }   
}
