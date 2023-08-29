package Java_Practise_Codes;

public class j1 {
    public static void main(String[] args) {
        String s1 = "pratik patil";
        String output = "";
        String[] ar = s1.split(" ");

        for (String wb : ar) {

            String rev = " ";
            for (int i = wb.length() - 1; i >= 0; i--)
                rev = rev + wb.charAt(i);

            output = output + rev;
        }
        System.out.println(output);

    }
}
