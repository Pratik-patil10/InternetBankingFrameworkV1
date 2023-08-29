package Java_Practise_Codes;

public class string_rev {

    public static void main(String[] args) {
        String s = "Pratik Patil";
        //litaP kitarP
        String output = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            output = output + s.charAt(i);
        }
        System.out.println("String reverse is:- " + output.toLowerCase());

        //output-Patil Pratik
        String[] s1 = s.split(" ");
        String rev = " ";
        for (int i = s1.length - 1; i >= 0; i--) {
            rev = rev + s1[i] + " ";
        }
        System.out.println("String in reverse word:- " + rev);

        String str = "Reversecount";
        String out = " ";
        System.out.println("Input string is:- " + str);

        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);

            String st = Character.toString(cc);

            if (!out.contains(st)) {
                out = out + st;

            }

        }
        System.out.println("Unique String is:- " + out);


    }

}

