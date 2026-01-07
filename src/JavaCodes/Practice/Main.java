package JavaCodes.Practice;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {

        try{
            int a;
        }
        catch (Exception e){

        }

//        String str1 = "abc";
//        String str2 = new String("abc");
//
//
//        Student student1 = new Student("abc", 1);
//        Student student2 = new Student("abc", 1);
//
//        System.out.println(student1.equals(student2));

//        int[][] arr = {
//                {1, 2},
//                {2, 1},
//                {0, 3}
//        };
//        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
//        System.out.println(Arrays.deepToString(arr));

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(2);
        pq.offer(1);
        System.out.println(pq);

        List<Book> bookPq = new ArrayList<>();
        bookPq.add(new Book("book1", 1));
        bookPq.add(new Book("book2", 2));
        bookPq.add(new Book("book3", 3));

        System.out.println(bookPq);
        Collections.sort(bookPq , Collections.reverseOrder());

    }

}
class Book implements Comparable<Book> {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getPrice() - o.getPrice();
    }
}
