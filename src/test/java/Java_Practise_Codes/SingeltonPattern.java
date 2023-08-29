package Java_Practise_Codes;

public class SingeltonPattern {

    private static SingeltonPattern singeltonPattern_instance=null;
    String s;

    private SingeltonPattern() {
       s="I am constructor";
    }

    //static method for veryfing the singeleton obj only
    public static synchronized SingeltonPattern getInstance()
    {
        if (singeltonPattern_instance == null){
            singeltonPattern_instance = new SingeltonPattern();
        }
        return singeltonPattern_instance;
    }

    public static void main(String[] args) {
        SingeltonPattern s1=SingeltonPattern.getInstance();
        SingeltonPattern s2=SingeltonPattern.getInstance();

        //veryfing through hashcode that  it is same obje refred everytime
        System.out.println("Hashcode of S1:- "+s1);
        System.out.println("Hashcode of S2:- "+s2);
    }


}
