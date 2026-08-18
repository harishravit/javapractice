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
            System.out.print(i+1);
        }
    }
}
class O_n2{
/* oru element ku (n) steps execute aagum, so total n*n steps aagum.
example : Oru van la n rows, n columns boxes irukku nu vechukalam.
Quality checker oru row ku poi, andha row full ah check pannuvaru (n boxes).
Appuram next row ku poi, andha row full ah check pannuvaru (innum n boxes).
Ivaru total n rows ku poi, ovuru row layum n boxes check pannuvaru.
So total checks = n rows * n boxes = n*n = O(n²)
*/

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
class O_cn{
    /*O(cn) means O(constant * Number of steps/Operations) ithu rendu indpentant
    loop denote panuthu because first loop run on num.length time so inga n=number of input size*/
    void o_cn(){
        int[] num={1,2,3,4,5,6}; // Order of operations (number of input size) / O(n) => n=6 => O(6n) 
        for( int i=0;i<num.length;i++){  //this loop run on number of input size. n=6
            System.out.print(i+1); // operation perform O(1n) remove constant become O(n)
        }
        System.err.println();
        int sum=0;
        for( int i=0;i<num.length;i++){ //this loop run on number of input size. n=6
            sum=sum+i;  // operation perform O(1n) remove constant become O(n)
        }
        System.out.println(sum);
    }
}
/* O(log n) half of half oru array split pani search panum.
largest data set la steps romba kamiyakum compare than O(n)
example : dictionary la "R" ah theda direct mid page ku poi
right or left page change pani find panrathu.  
*/

/* O(n log n) half of half oru array split pannanum.then split panna array ku O(log n) method
apply pani process pannanum.  
*/

// Order of notation's based on it speed
/*  
    1.O(1) => Constant time
    2.O(log n) => Logarithemetic
    3.O(n) =>Linear time
    4.O(n log n) => Linearithemetic
    5.O(n2) => Quadtradic
    6.O(2n)  => Exponetial
        One input ku (2^n) branchs create aagum (1->2->4->8->16->32->64).
    7.O(n!) => Factorial
        antha number oda factorial count ku loop run aagum. n=5 na steps 120.
 */
public class Time_Space_com {
    public static void main(String[] args) {
        //O(1) Time complexity (constant time)
        O_1 oOne=new O_1();
        oOne.o_1(3);
        System.out.println("-----------------------");
        //O(n) Time complexity (linear time)
        O_n o_n=new O_n();
        o_n.o_n();
        System.out.println("\n-----------------------");
        //O(n2) Time complexity (Quantradic time)
        O_n2 o_n2=new O_n2();
        o_n2.o_n2();
        System.out.println("\n-----------------------");
        //O(2n) equal to O(n) - Linear time. because constant remove here.
        O_cn o_cn=new O_cn();
        o_cn.o_cn();

    }
}
