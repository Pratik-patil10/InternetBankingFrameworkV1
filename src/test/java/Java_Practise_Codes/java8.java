package Java_Practise_Codes;

import java.util.Arrays;

public class java8 {
    public static void main(String[] args) {
        addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(9, 10));


        addable mult2 = (a, b) -> (a * b);
        System.out.println(mult2.add(10, 10));

        int a[] = {2, 1, 5, 4};
        Arrays.sort(a);
//        for (int i=0;i<=a.length;i++){
//            System.out.println(a[i]+" ");
//        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }


    }

    public int add(int a, int b, int c) {

        c = a + b;
        return c;
    }


}
