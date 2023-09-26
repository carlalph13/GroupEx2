package GroupEx2;

public class T6 {

    public static void nonRepeat(String str) {


        for (char i:str.toCharArray()){

            if (str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        nonRepeat("abracadabra");
    }
}



