package StreamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {
    public static void main(String[] args) {

        List<String> productList= Arrays.asList("MacBook","Watch","Iphone","Ipad");
        System.out.println(productList);

        List<String> result= productList.stream().filter(ele -> ! ele.equals("Watch")).collect(Collectors.toList());
        result.forEach(System.out :: println);
    }
}
