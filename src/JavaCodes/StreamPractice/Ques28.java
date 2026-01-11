package JavaCodes.StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques28 {
    public static void main(String[] args) {

        // 28. Group a List of Objects by a Specific Attribute

        List<Person> personList = List.of(
                new Person("Alice", 22),
                new Person("Bob", 22),
                new Person("Charlie", 25),
                new Person("Mike", 30),
                new Person("Jim", 56)
        );

        System.out.println(personList.stream().collect(Collectors.groupingBy(Person::getAge)));

    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ')';
    }
}
