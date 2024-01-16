package StreamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {
    public static void main(String[] args) {


        List<Customer> customersList = Arrays.asList(
                new Customer("Tom",24),
                new Customer("Harry",21),
                new Customer("George",28)
        );

        String name=customersList.stream()
                .filter(x -> "Tom".equals(x.getName()))
                .map(Customer::getName)
                .findAny()
                .orElse(null);
        System.out.println(name);

        System.out.println("---------------");

        List<String> custlist=customersList.stream()
                     .map(Customer::getName)
                     .collect(Collectors.toList());
        custlist.forEach(System.out::println);



    }
}
