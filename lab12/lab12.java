package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class lab12 {
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String[] args) {
        System.out.println("nikita.eg0110@mail.ru: "+checkEmail("nikita.eg0110@mail.ru"));
        System.out.println("niita@gmail.com: "+checkEmail("niita@gmail.com"));
        System.out.println(".@mail.ru:"+checkEmail(".@mail.ru"));
        System.out.println("nikich@.mail:"+checkEmail("nikich@.mail"));
        System.out.println("eg@g@mail.ru: "+checkEmail("eg@g@mail.ru"));
    }
}
