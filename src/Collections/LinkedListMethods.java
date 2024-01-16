package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        // LinkedList is default class in java
        //it can be used as List,stack,queue
        //it allows the null entry
        //dynamic collection
        //hence insertion and deletion can be easily implemented
        //it can contain duplicate element
        //it  is not synchronised/Thread safe
        //in LL , manipulation is fast because we don't any shifting

        //LL constructors

        //LinkedList();
        //LinkedList(Collection c);

        LinkedList<String> names=new LinkedList<>();
        System.out.println(names.size());

        names.add("Tom");
        names.add("Naveen");
        names.add("John");
        names.add("Lisa");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(1));

        Iterator<String> it=names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        names.add(4,"Jia");
        names.add(1,"Disha");

        System.out.println(names);

        LinkedList<String> users=new LinkedList<>();

        users.add("tia");
        users.add("kith");
        users.add("wick");

        names.addAll(users);
        System.out.println(names);

        names.addFirst("fin");
        names.addLast("gigi");
        System.out.println(names);

        names.removeAll(users);
        System.out.println(names);

        //reverse linkedList
        Iterator<String> itr=names.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String e : names){
            System.out.println(e);
        }




    }
}
