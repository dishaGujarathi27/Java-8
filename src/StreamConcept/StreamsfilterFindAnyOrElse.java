package StreamConcept;

import java.util.Arrays;
import java.util.List;

public class StreamsfilterFindAnyOrElse {
    public static void main(String[] args) {

        List<Customer> customersList = Arrays.asList(
                new Customer("Tom",24),
                new Customer("Harry",21),
                new Customer("George",28)
        );

       Customer customer= customersList.stream()
               .filter(x -> "Harry".equals(x.getName()))
               .findAny()
               .orElse(null);
        System.out.println(customer.getName() + "   " + customer.getAge());

        System.out.println("---------------");

        Customer customer1= customersList
                            .stream()
                            .filter(x -> "Disha".equals(x.getName()))
                             .findAny()
                            .orElse(null);
        System.out.println(customer1.getName() + "   " + customer1.getAge());

        System.out.println("----------------------");
        //multiple condition
        Customer customer2= customersList
                .stream()
                .filter(x -> "Harry".equals(x.getName()) && 21== customer.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer2.getName() + "   " + customer2.getAge());


    }
}
