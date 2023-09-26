package GroupEx2;

public class T1 {
    public static void main(String[] args) {
        String wordOne="hello";
        String wordTwo="world";

        wordOne=wordOne+wordTwo;
        wordTwo=wordOne.substring(0, wordOne.length()-wordTwo.length());
        wordOne=wordOne.substring(wordTwo.length());
        System.out.println(wordOne);
        System.out.println(wordTwo);


    }



}
