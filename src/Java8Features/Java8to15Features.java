package Java8Features;

import java.util.*;
import java.util.stream.Stream;

public class Java8to15Features {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e->e%2==0).forEach(e->System.out.println(e));

        Stream.of("hello","world")
                .map(e->e +"world")
                .forEach(System.out::println);

        // Optional : Jdk 8
        String s[]=new String[5];
        s[2]="Disha";
        Optional<String> isNull=Optional.ofNullable(s[2]);
        if(isNull.isPresent()){
            System.out.println(s[2] + "  " + s[2].length());

        }else{
            System.out.println("value is not available");
        }

        isNull.ifPresent(e-> System.out.println(e.length()));
        Optional<String> nothing=Optional.empty();
        nothing.ifPresent(e-> System.out.println("Bye...."));

        //Jshell :Jdk 9

        //factory methods for immutable collection
        //before
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //after
        List<Integer> lang=List.of(1,2,3,4,5,6);
        lang.stream().forEach(e->System.out.println(e));

        //Jdk 10 : var keyword
        var x=10;
        System.out.println(x+10);
        var y="10";
        System.out.println(y+10);
        var h=new HashSet<String>();
        h.add("Tom");
        var h1=new ArrayList<String>();
        h1.add("Naveen");
        System.out.println(h1.get(0));

        //new switch case in Jdk 12
//        var n=3;
//        var m =switch(n){
//            case 1 -> "one";
//            case 2 -> "two";
//            case 3 -> "three";
//            case 4 -> "four";
//            default -> "number not found";
//        };



        //jdk 13 multi line string
        //json xml
        /*
        var response="""
        {
           "name" : "tom",
           "age":"21"
           "place":"LA"
        }"""
        System.out.print(response);
         */

        //

    }
}
