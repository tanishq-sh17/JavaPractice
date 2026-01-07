package JavaCodes.CollectionFramework.ArrayList;

import JavaCodes.CollectionFramework.Student;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        String[] arr = {"abc", "def", "ghi"};
        List<String> l2 = Arrays.asList(arr);
//        l2.add("str");   // can't add elements
        l2.set(0, "good"); // but can modify the current elements
        List<String> l3 = new ArrayList<>(l2);  // by doing this we can get full functionality of an ArrayList
        l3.add("jkl");
//        System.out.println(l3);


        List<Integer> l5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        l5.set(0, 2);
//        System.out.println(l5);

        List<Integer> l6 = new ArrayList<>();
        l6.add(1);
        l6.add(2);
        l6.add(3);

        List<Integer> l7 = List.of(4, 5, 6, 7, 8);

        l6.addAll(l7);  // this will add all the elements of l7 in l6
//        l7.addAll(l6);  // but we can't do something like this


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<String> list2 = new ArrayList<>();
        list2.add("andna");
        list2.add("udfudh");

        // calling the remove(int index)
//        list1.remove(1);
//        list2.remove(1);

        // calling the remove(Object o)
//        list2.remove("andna");
        // for primitive type of list we have to do something like this to call remove
        // method of type Object.
//        list1.remove(Integer.valueOf(1));

//        System.out.println(list1);
//        System.out.println(list2);

        // Converting a list to an array
        Object[] array = list1.toArray();
        Integer[] array1 = list1.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array1));


        // sorting a list
//        Collections.sort(l6);  // we can sort like this or
//        l6.sort(null); // we can use .sort() but then we have to provide a Comparator or null
//        l6.sort(new MyComparator());

        // or we can use lamba expression instead of creating a class for custom Comparator
        l6.sort((a, b) -> b - a);
        System.out.println(l6);


        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort(null);
//        words.sort(new StringLenghtComparator());

        // or we can use lamba expression instead of creating a class for custom Comparator
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);



        // trying to sort objects of Student class using Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanishq", 7.6));
        students.add(new Student("Shrivas", 10));
        students.add(new Student("God", 10));
//        students.sort((o1, o2) -> (int) (o2.getGpa() - o1.getGpa()));

//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa)
//                .reversed().
//                thenComparing(Student::getName);

//        students.sort(comparator);
        // OR
//        Collections.sort(students, comparator);

        // Or we can Compare like this -

        students.sort((s1, s2) -> {
            if((s2.getGpa() - s1.getGpa()) > 0){
                return 1;
            } else if((s2.getGpa() - s1.getGpa()) < 0){
                return -1;
            } else{
                return s1.getName().compareTo(s2.getName());
            }
        });

        for(Student s : students){
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();  // sorting according to length (small -> large)
        return s2.length() - s1.length();  // (large -> small)
    }
}
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1 - o2;  // sorting in ascending order
        return o2 - o1;  // sorting in descending order
    }
}