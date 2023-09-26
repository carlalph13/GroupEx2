package GroupEx2;

public class T3 {
  /*  Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH". */

    public static void main(String[] args) {

        String w="madam";
        String rev="";

        for (int i =w.length()-1 ; i >=0 ; i--) {

            rev+=w.charAt(i);

        }
       if(w.equals(rev)){
           System.out.println(w+" is a palindrome");
       }else{
           System.out.println(w+ " is not a palindrome" );
       }


    }

}




