package StreamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetwithFlatMap {
    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.setEmpName("Ross");
        emp.addDevices("Iphone");
        emp.addDevices("Nokia");
        emp.addDevices("MacBook pro");
        emp.addDevices("Ipad");
        emp.addDevices("Nokia");


        Employee emp1=new Employee();
        emp1.setEmpName("monica");

        emp1.addDevices("Iphone11");
        emp1.addDevices("Lenovo");
        emp1.addDevices("MacBook air");
        emp1.addDevices("Samsung");
        emp1.addDevices("Nokia");

        List<Employee> empLists= new ArrayList<>();

        empLists.add(emp);
        empLists.add(emp1);

        List<String> deviceList =empLists.stream()
                .map(x->x.getDevices())
                .flatMap(x->x.stream())
                .distinct()
                .collect(Collectors.toList());

        deviceList.forEach(x -> System.out.println(x));






    }
}
