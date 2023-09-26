package GroupEx2;

public class T2 {
  /*  Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH". */

    public static void main(String[] args) {

        String w="Hello";
        String rev="";

        for (int i =w.length()-1 ; i >=0 ; i--) {

            rev+=w.charAt(i);

        }
        System.out.println(rev);


    }

}




