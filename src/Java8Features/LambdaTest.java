package Java8Features;

import com.sun.security.jgss.GSSUtil;

public class LambdaTest {
    public static void main(String[] args) {

        Webpage w1=(value , age )-> System.out.println("hello"  +value + " age -->" +age);

        Webpage w2=(value , age) -> System.out.println(value.length());

        Webpage w3=(value , age) -> System.out.println(value.toUpperCase());

        w1.header("world" , 17);
        w2.header("fish",32);
        w3.header("david", 28);

    }
}
