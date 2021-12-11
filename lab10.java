package lab10;

import java.util.ArrayList;

public class lab10 {    //задание 1
    public static <E> ArrayList<E> arrayToList(E[] arr){
        if(arr == null)
            throw new IllegalArgumentException("Null array!");
        ArrayList<E> l = new ArrayList<>(arr.length);
        for (E element : arr) {
            l.add(element);
        }
        return l;
    }
        public static void main(String[] args) {
            String[] a = new String[]{"1", "hi", "!","as","s2","3","2"};
            ArrayList<String> l = arrayToList(a);
            System.out.println(l);
            System.out.println();

        }
}
