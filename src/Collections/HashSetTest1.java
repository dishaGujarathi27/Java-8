package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String[] args) {
        Set<String> st=new HashSet<>();
        st.add("Alpha");
        st.add("Beta");
        st.add("Testing");
        st.add("Beta");
        st.add(null);

        System.out.println(st);
        System.out.println(st.contains("Testing"));
        System.out.println(st.contains(null));

        System.out.println("---------------------------");

        for(String s: st){
            System.out.println(s);
        }

        System.out.println("-------------------------");

        Iterator<String> it= st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        st.remove("Beta");
        System.out.println(st);

        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[]{ 1,2,3,4,5,8,9,10}));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[]{ 1,2,4,5,9,0}));

        // get the union
        Set<Integer> union=new HashSet<Integer>(first);
        union.addAll(second);
        System.out.println(union);

        System.out.println("----------------");

        //get the intersection
        Set<Integer> intersection =new HashSet<Integer>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        System.out.println("-------------------");

        //get the difference
        Set<Integer> diff=new HashSet<Integer>(first);
        diff.removeAll(second);
        System.out.println(diff);


    }
}
