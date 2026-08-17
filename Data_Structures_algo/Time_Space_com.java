package Data_Structures_algo;
class O_1{
    /*  Evalo input size vanthalum ore time & speed than
    ella data vukum use pannum
    example :library la poi librarien ketu book vangurathu
    because librarien kita register la book oda address irukum
    atha vachi easy ah kandupudichidalam.*/
    void o_1(int pos){
        int[] num={1,2,3,4,5,6};
        System.out.println(num[pos]);
    }
}
class O_n{
    /*Ovuru step ah travel pani element ah edukum.
    example: padikatu eeruvathu maathiri number of padikatu increase aagurapa
    travel pantra time increase aagum */
    void o_n(){
        int[] num={1,2,3,4,5,6};
        for( int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
    }
}
class O_n2{
    void o_n2(){
        int sum=0;
        int [][] num={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                sum+=num[i][j];
            }
        }
        System.out.print(sum);
    }
}
public class Time_Space_com {
    public static void main(String[] args) {
        //O(1) Time complexity (constant time)
        O_1 oOne=new O_1();
        oOne.o_1(3);
        //O(n) Time complexity (linear time)
        O_n o_n=new O_n();
        o_n.o_n();
        //O(n2) Time complexity (Quantradic time)
        O_n2 o_n2=new O_n2();
        o_n2.o_n2();
    }
}
