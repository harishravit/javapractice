1.What is function pass by value and refrence?

core difference:
    - pass by value => actual variable value pass agum.
    - pass by refrence => actual variable refrence address pass agum.

Pass by value:
    Itha use pani oru variable oda value change panna try panna outside value affect aagathu.
because actuall function  ku pass aagurathum direct value than.
code
```java
package Passbyvalueandref;
public class pass_by_value_ref {
    static void modifyRef(int[] num){
        System.out.println("address of num = "+num);
        num[0]=10;
    }
    static void modifyValue(int b){ // Inga "b" vanthu 10 value receive pani store panikuthu.
        b=90; 
    }  
    public static void main(String[] args) {
        int a=10;
        int[] b={1,2,3};
        System.out.println("address of b = "+b);
        modifyRef(b);
        System.out.println(b[0]);
        modifyValue(a);  //inga actuall 10 pass aguthu
        System.out.println(a);

    }
}
```
2. Pass by value la yean 10 pass aaguthuna?
    Stack la primitive types oda values direct store aagum, so pass pantrapa andha function stack value receive panikum.
Athanala than andha (int b) la 10 apadinu value kidaikithu, change panna nenacha andha method variable "b" matumthan change aagum.
Outside "a" change aagathu.

Stack memory management:
```java
int a=10;
// main method call aagi int a=10 storage allocate aagitu.
STACK:
----------------
    a  |    10 |
----------------

modifyValue(a);
// modifyValue method call aagi, int b=10 storage AGAIN allocate aagudhu (b oda VALUE, "a" oda VALUE-oda COPY).
// a matum b — RENDUM vera vera stack slots, VALUE mattum same-a irukku (10).
STACK:
----------------
    a  |    10 |
----------------
    b  |    10 |
----------------

b = 90;
// b oda stack slot mattum change aagum. a oda slot touch aagave illa.
STACK:
----------------
    a  |    10 |
----------------
    b  |    90 |
----------------

// modifyValue() mudinjadhum, b oda stack slot poyiduchu.
STACK:
----------------
    a  |    10 |
----------------

System.out.println(a);
// a innum adhoda ORIGINAL slot-la 10 nu irukku — never touched.
// output: 10  <-- change theriyala, because a matum b vera vera independent stack slots.
```

Core reason:
- `a` oda "value" nu solradhu literal number `10` dhaan — function call pannumbodhu, andha number oda COPY dhaan `b`-ku pogudhu.
- `b`-la enna maathinaalum, adhu `b`-oda own slot-la mattum aagum — `a`-oda slot vera location, adhu affect aagave aagadhu.
Adhanala primitive types-ku, function-ku pass aagura variable — original-oda "reference" illa, original-oda "value"-oda snapshot copy.

3. Pass by reference (array) la yean address share aaguthuna?
    Inga values direct-a store aagala, adha maari oru vera place la (Heap) values store aagi, andha place oda address return aagum.
Andha address than Stack la store aaguthu. atha than andha method variable use panni point pannuthu.

    Heap la actual array data (`{1,2,3}`) store aagum, andha heap block ku oru address kidaikum (example: 0x9F1).
Stack la irukura variable `b`, andha array data-va nera hold pannala — adhu andha heap address matum hold pannudhu.

modifyRef(b) call pannumbodhu, `b` oda VALUE (adha 0x9F1 address) copy aayi `num`-ku pogudhu.
So `num` and `b` — RENDUM vera vera stack variables, aana RENDUM SAME heap address point pannudhu.

Adhanala num[0]=10 pannumbodhu, andha SAME heap block modify aagudhu — so `b[0]` um 10 nu maari kaanum.

Heap memory management:
```java
int[] b = {1,2,3};
// main method call aagi array {1,2,3} HEAP la create aagudhu (address 0x9F1)
// b (stack) andha heap address hold pannudhu
STACK:
----------------
    b  | 0x9F1 |
----------------

HEAP:
------------------------
  0x9F1  |  [1, 2, 3]  |
------------------------

modifyRef(b);
// modifyRef method call aagi, num (stack) create aagudhu
// b oda VALUE (0x9F1) copy aayi num ku poidhuchu — SAME address
STACK:
----------------
    b   | 0x9F1 |
----------------
   num  | 0x9F1 |
----------------

HEAP:
------------------------
  0x9F1  |  [1, 2, 3]  |
------------------------

num[0] = 10;
// num, 0x9F1 point pannuradhala, HEAP la irukura ACTUAL array modify aagudhu
STACK:
----------------
    b   | 0x9F1 |
----------------
   num  | 0x9F1 |
----------------

HEAP:
------------------------
  0x9F1  |  [10, 2, 3] |   <- change aachu
------------------------

// modifyRef() mudinjadhum, num oda stack slot poyiduchu
// aana heap la array [10, 2, 3] nu already maari irukku
STACK:
----------------
    b   | 0x9F1 |
----------------

HEAP:
------------------------
  0x9F1  |  [10, 2, 3] |
------------------------

System.out.println(b[0]);
// b innum 0x9F1 point pannudhu, andha heap la 10 irukku
// output: 10  <-- change theriyudhu, because b and num same heap block share pannanga
```

Core difference b (array) vs a (int) ku:
- `a` oda "value" nu solradhu literal number `10` — adhu copy aana, oru pudhu independent number dhaan.
- `b` oda "value" nu solradhu heap address `0x9F1` — adhu copy aana, RENDU variables um SAME heap object-a share pannudhu.

Adhanala array/object modify panna, original-um affect aagum — aana array/object itself-a REPLACE panna (`num = new int[5]`), adhu `b`-a touch pannadhu, enna adhu `num` oda stack slot-a matum rewrite pannudhu, `b` oda slot illa.