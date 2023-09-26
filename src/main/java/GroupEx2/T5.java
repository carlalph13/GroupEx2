package GroupEx2;

import java.util.Arrays;

public class T5 {
    public static void main(String[] args) {

        String w1 = "listen";
        String w2 = "Silent";

        w1= w1.toLowerCase();
        w2 = w2.toLowerCase();



        if (w1.length()== w2.length()) {

            char[] arr1 = w1.toCharArray();
            char[] arr2 = w2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println(w1 + " and " + w2 + " are anagrams.");
            } else {
                System.out.println(w1 + " and " + w2 + " are not anagrams.");
            }


        }
    }
}


