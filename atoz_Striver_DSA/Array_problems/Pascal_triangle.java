package atoz_Striver_DSA.Array_problems;

import java.util.ArrayList;

public class Pascal_triangle {
    public static void main(String[] args) {
        ArrayList<Integer> previous = new ArrayList<>();
        ArrayList<Integer> previousTemp = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            System.out.print(1 + " ");
            if (i == 0) {
                previous.add(1);
            }
            if (previous.size() >= 2) {
                previousTemp.addAll(previous);
                previous.clear();
                for (int k = 0; k < previousTemp.size() - 1; k++) {
                    int sum = previousTemp.get(k) + previousTemp.get(k + 1);
                    if (k == 0) {
                        previous.add(1);
                    }
                    previous.add(sum);
                    System.out.print(sum + " ");
                }
                previousTemp.clear();
                if (i >= 2) {
                    System.out.print(1);
                    previous.add(1);
                }
            } else {
                previous.add(0);
            }
            System.out.println();
        }
    }
}
