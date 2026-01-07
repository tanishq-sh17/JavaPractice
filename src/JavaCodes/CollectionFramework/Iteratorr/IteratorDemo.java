package JavaCodes.CollectionFramework.Iteratorr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            list.add(i);
        }

//        for(int i : list){
//            if(i % 2 == 0){
//                list.remove(i);
//            }
//        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next() % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
