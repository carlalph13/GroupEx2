package GroupEx2;

import java.util.ArrayList;

public class T7 {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Strawberry");
        fruit.add("Avocado");
        fruit.add("Mango");
        fruit.add("Kiwi");


        fruit.removeIf(x -> !x.startsWith("A"));
        System.out.println(fruit.toString().toLowerCase());

    }
}