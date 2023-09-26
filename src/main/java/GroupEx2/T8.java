package GroupEx2;

public class T8 {

    public static String Increment(String str) {
        char[] chars = str.toCharArray();
        int carry = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            int digit = chars[i] - '0' + carry;
            carry = digit / 10;
            chars[i] = (char) ('0' + digit % 10);
        }


        if (carry > 0) {
            char[] result = new char[chars.length + 1];
            result[0] = (char) ('0' + carry);
            System.arraycopy(chars, 0, result, 1, chars.length);
            return new String(result);
        } else {
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "53456";
        String str3 = "29";

        System.out.println(Increment(str1));
        System.out.println(Increment(str2));
        System.out.println(Increment(str3));
    }
}
