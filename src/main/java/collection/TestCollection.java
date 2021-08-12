package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class TestCollection {
    public static void main(String[] args) {
        int[] array = new int[15];
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");

        for (int i=0; i<collection.size(); i++){
            System.out.println(((ArrayList<?>) collection).get(i));
        }





        
    }

}
