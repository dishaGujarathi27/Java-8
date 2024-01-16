package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {

        // 1 Collection.synchronized

        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("java");
        namesList.add("ruby");
        namesList.add("python");

        // for adding and removing --we don't need explicit synchronization
        //to fetch/traverse the values from this list-- we need explicit synchronization

        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        System.out.println("-----------------------------------------------------");

        // 2 copyonwritearraylist : it's a class : Thread safe/synchronized already

        CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Harry");

        //we don't need explicit synchronization for any operation : add / remove / traverse
        Iterator<String> it1 = empList.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


    }
}