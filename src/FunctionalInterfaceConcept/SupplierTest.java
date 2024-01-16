package FunctionalInterfaceConcept;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        /*
        Represents a supplier of results.
        There is no requirement that a new or distinct result be returned each time
        the supplier is invoked.
        This is a functional interface whose functional method is get().
        takes no arguement and returns something
         */
        getText(() ->"Java");
        getText(()->"Ruby");

    }

    public static void getText(Supplier<String> text){
        System.out.println(text.get().length());
    }
}
