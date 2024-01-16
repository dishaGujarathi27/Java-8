package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListiterationTest {
    public static void main(String[] args) {

        ArrayList<String> tvSeries=new ArrayList<String>();
        tvSeries.add("Friends");
        tvSeries.add("The big bang theory");
        tvSeries.add("Tow and a half men");
        tvSeries.add("Modern Family");

        // 1. Using java 8 for each loop with lambda expression
        System.out.println("------print using for each with lambda-------");
        tvSeries.forEach( shows -> {
            System.out.println(shows);
        });

        //2.using iterator
        System.out.println("-----print using iterator------");
        Iterator<String> it=tvSeries.iterator();
        while (it.hasNext()){
            String show= it.next();
            System.out.println(show);
        }

        //3.using iterator and lambda and foreachremaining method
        System.out.println("-----print using iterator and lambda and forEachRemaining------");
        it= tvSeries.iterator();
        it.forEachRemaining(show ->{
           System.out.println(show);
       });

        //4.using for each loop
        System.out.println("-----print using for each loop-------");
        for(String show : tvSeries){
            System.out.println(show);
        }

        //5.using for loop with order/index
        System.out.println("-----print using for  loop-------");
        for(int i=0;i< tvSeries.size();i++){
            System.out.println(tvSeries.get(i));
        }

        //6.using listiterator to traverse in both direction
        System.out.println("-----print using listiterator to traverse in both direction -------");
        ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
        while (tvSeriesListIterator.hasPrevious()){
            String show= tvSeriesListIterator.previous();
            System.out.println(show);
        }


    }
}
