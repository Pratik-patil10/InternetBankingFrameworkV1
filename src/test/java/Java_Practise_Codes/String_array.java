package Java_Practise_Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class String_array {
    public static void main(String[] args) {
        System.out.println("=========Unique value in Array/String===========");

        String s1 = "java c++ cc cc python python java";
        String[] arr1 = s1.split(" ");

        boolean flag1 = false;

        HashSet<String> hs2 = new HashSet<>();

        for (String dp : arr1) {
            System.out.println(hs2.add(dp));
            if (hs2.add(dp)) {
                System.out.println("Unique Values are:- " + dp);
                flag1 = true;
            }
        }

        if (!flag1) {
            System.out.println("No Unique Values");

        }


        System.out.println("=========Duplicate value in Array===========");

        String[] arr = {"java", "c++", "cc", "python", "java"};

        boolean flag = false;

        HashSet<String> hs = new HashSet<>();

        for (String dp : arr) {
            if (!hs.add(dp)) {
                System.out.println("Duplicated Values are:- " + dp);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No Duplicated Values");

        }

        System.out.println("=========Sorting value in Array===========");

        int ab[] = {2, 4, 1, 9, 5};
        System.out.println("Array before sorting:- " + Arrays.toString(ab));

        boolean fl = false;
        int n = ab.length - 1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ab[j] > ab[j + 1]) {
                    int temp = ab[j];
                    ab[j] = ab[j + 1];
                    ab[j + 1] = temp;
                }

            }

        }
        System.out.println("Array after sorting:- " + Arrays.toString(ab));
        Arrays.sort(ab);
        System.out.println("Array after sorting using sort method:- " + Arrays.toString(ab));

        System.out.println("=========Remove special character from a string===========");

        String s = " !#^$(* REMOVE SPL CHAR&^#( FRO#&^$)!Mstring(*@$";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("String after removal of special char:" + s);

        System.out.println("=========Remove white spaces from a string===========");
        String str1 = "Java  Programming       AUtomations";
        System.out.println("Before removing the white space:-" + str1);

        String str2 = str1.replaceAll("\\s", "");
        System.out.println("Before removing the white space:-" + str2);

        System.out.println("=========Count of word from a string===========");
        String s3 = "java with java";
        int len = s3.length();
        System.out.println("Length is:-" + len);

        int len2 = s3.replace("j", "").length();
        System.out.println(len2);

        int count = len - len2;
        System.out.println("Count of a is:- " + count);


        System.out.println("=========Count total number of words from a string===========");

        String s4 = "Welcome to java";
        int coun = 1;
        String[] sarr = s4.split(" ");
        System.out.println(sarr.length);


        System.out.println("=========Reverse each words from a string====//- avaj ot emoclew- //=======");
        String s5 = "welcome to java";
        String output = "";

        for (int i = s5.length() - 1; i >= 0; i--) {
            char c = s5.charAt(i);
            output = output + c;
        }
        System.out.println(output);

        System.out.println("=========Reverse words from a string=======//- java to welcome -//====");
        String s6 = "welcome to java";
        String[] ar4 = s6.split(" ");
        String output2 = "";

        for (int i = ar4.length - 1; i >= 0; i--) {
            output2 = output2 + ar4[i] + " ";
        }
        System.out.println(output2);

        System.out.println("=========Reverse each word from a Statement string======//- emoclew ot avaj -// =====");
        String s7 = "welcome to java";
        String[] ar5 = s7.split(" ");
        String output3 = "";

        //Approach -1
        for (String w : ar5) {
            String rev2 = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev2 = rev2 + w.charAt(i);

            }
            output3 = output3 + rev2 + " ";
        }
        System.out.println(output3);

        //Approch -2 using string builder
        String s8 = "welcome to java";
        String[] ar6 = s8.split(" ");
        String output4 = "";

        for (String wb : ar6) {
            String reverse = "";
            StringBuilder sb = new StringBuilder(wb);
            sb.reverse();
            reverse = reverse + sb;

            output4 = output4 + reverse + " ";
        }
        System.out.println("Using string builder:- " + output4);

        System.out.println("=========String Palindrome==========");

        String pl, che = "";
        System.out.print("Enter your String:- ");
        Scanner sc = new Scanner(System.in);
        pl = sc.nextLine();
        boolean flg = false;
        for (int i = pl.length() - 1; i >= 0; i--) {
            che = che + pl.charAt(i);

            if (pl.equalsIgnoreCase(che)) {
                flg = true;
            }


        }
        if (flg) {
            System.out.println("String is palindrome!! :)");
        } else {
            System.out.println("String is Not Palindrome :(");
        }

    }
}
