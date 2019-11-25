package generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // how to declare ArrayList
        ArrayList<Double> list = new ArrayList();//Generics
//        list.add(2);
//        list.add("Tushar");
        list.add(2.34);//Double
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
// Wrapper


