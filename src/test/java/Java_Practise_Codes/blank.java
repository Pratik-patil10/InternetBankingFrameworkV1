package Java_Practise_Codes;

public class blank {
    public static void main(String[] args) {
        String s = "pratik patil";
        String output = "";
        String [] arr=s.split(" ");

        for (String rev:arr) {
            String out="";

            for (int i= rev.length()-1;i>=0;i--){
                out=out+rev.charAt(i);
            }
            output=output+out+" ";

        }
        System.out.println(output);

//        for (int i = 0; i < s.length(); i++) {
//            String str = "";
//            char c = s.charAt(i);
//            String d = Character.toString(c);
//
//            if (!output.contains(d)) {
//                output = output + c;
//
//            }
//
//        }
//        System.out.println("stringLength:- "+output.length());

    }
}
