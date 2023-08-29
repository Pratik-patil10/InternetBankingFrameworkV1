package Java_Practise_Codes;

import java.util.*;
import java.util.stream.Collectors;

public class arrays_collections {
    public static void main(String[] args) {

        String s = " Rat Cat Dog Rat Bull Cat Cat ";
        String output = "";
        int count;

        String a[] = s.split(" ");
        HashSet<String> expect = new HashSet<String>();

        for (String temp : a) {
            expect.add(temp);
        }


        Iterator<String> it1 = expect.iterator();
        while (it1.hasNext()) {
            count = 0;
            String temp1 = it1.next();
            for (String temp : a) {
                if (temp.equalsIgnoreCase(temp1)) {
                    count++;
                }

            }
            System.out.println("The Count is: " + count + " for- " + temp1);

        }
        System.out.println("================================================");


        ArrayList al = new ArrayList<>();
        al.add("HI");
        al.add("Hello");
        al.add("Heo");

        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }


        Vector vc = new Vector<>();
        vc.add("hey");
        vc.add("hii");
        vc.add("how");

        System.out.println(vc);
        Iterator itr1 = vc.iterator();

        Enumeration<String> en = vc.elements();

        while (en.hasMoreElements()) {

            // Print the elements using enum object
            // of the elements added in the vector
            System.out.println(en.nextElement());
        }

        while (itr1.hasNext()) {
            Object element1 = itr1.next();
            System.out.print(element1 + " ");
        }

        System.out.println("=====================ARRRAYSSSS===========================");
        int[] rev = {10, 55, 9, 23, 20, 30, 40, 84};
        Arrays.sort(rev);
        System.out.println("Array in Sorted:- ");

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        int[] rev1 = {10, 55, 9, 23, 20, 30, 40, 84};
        for (int k = 0; k < rev1.length; k++) {
            for (int l = k + 1; l < rev1.length; l++) {
                int temp = 0;

                if (rev1[k] < rev1[l]) {
                    temp = rev1[k];
                    rev1[k] = rev1[l];
                    rev1[l] = temp;
                }
            }
            System.out.println(rev1[k]);
        }


        System.out.println("Array in forward direction:- ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        System.out.println("Array in reverse direction:- ");
        for (int j = rev.length - 1; j >= 0; j--) {
            System.out.print(rev[j] + " ");
        }

        System.out.println();
        System.out.println("=======================Faboneciies series=========================");
        int n1 = 0, n2 = 1, n3, cal = 20;

        for (int i = 0; i < cal; i++) {
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        System.out.println("======================Factorial==========================");
        int fact = 1;
        System.out.println("Enter number:- ");

        Scanner sc = new Scanner(System.in);
//        int facnumber = sc.nextInt();
        int fa=4;

        for (int i = 1; i <= fa; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number " + fa + " is " + fact);

        System.out.println("==========================Streams ======================");


        HashSet<String> hs = new HashSet<>();
        hs.add("HI");
        hs.add("Hello");
        hs.add("Heo");

        Object collect = hs.stream().collect(Collectors.toList());

        hs.forEach(System.out::println);
        System.out.println("Usinggggg for each and converted to list:-"+collect);

        List<String> li= (List) hs.stream().collect(Collectors.toList());

        System.out.println("Set to list:- "+li);


        System.out.println("================================================");

        List<String> s1 = Arrays.asList("Rat Cat Dog Rat Bull Cat Cat ");
        List<String> nw=s1.stream().map(name->name.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(nw);

        System.out.println("================================================");




    }


}
