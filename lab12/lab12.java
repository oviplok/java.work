package lab12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab12 {

    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
            
        return m.find() && m.group().equals(s);
    }


    public static void main(String[] args) {

        //ex6(Email)
        System.out.println();
        System.out.println(checkEmail("sagrachov@gmail.com"));
        System.out.println(checkEmail(".sag rachov@gmail.com"));
        System.out.println(checkEmail("sagrachov.@.gmail.com"));
        System.out.println(checkEmail("sagrachov@gmail"));
        System.out.println(checkEmail("sagrachov@g@mail.ru"));

    }
}
