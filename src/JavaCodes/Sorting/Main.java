package JavaCodes.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class StringComparator implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
////        return s1.length() - s2.length();
//        return s2.length() - s1.length();
//    }
//}
//class MyComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
////        return o1 - o2;  // ascending
//        return o2 - o1;   // decending
//    }
//}

public class Main{
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//
////        list.sort(new MyComparator());
//        System.out.println(list);
//
//        List<String> words = Arrays.asList("banana", "apple", "date");
////        words.sort(new StringComparator());
//        words.sort((a, b) -> b.length() - a.length());
//        System.out.println(words);
//
//    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanishq", 3.6));
        students.add(new Student("Alice", 3.7));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Tan" , 3.9));

        students.sort(null);
        students.sort((o1, o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }
            else if(o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }
            else{
                return o1.getName().compareTo(o2.getName());   // comparing lexiographivd
            }
        });
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        for(Student s : students){
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
