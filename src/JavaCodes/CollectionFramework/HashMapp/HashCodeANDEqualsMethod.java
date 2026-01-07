package JavaCodes.CollectionFramework.HashMapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeANDEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");   // hascode1 --> index1
        map.put(p2, "Designer");   // hascode2 --> index2
        map.put(p3, "Manager");    // hascode3 --> index3

        System.out.println(map);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Tanishq", 90);   // hascode1 --> index1
        map1.put("Bob", 92);       // hascode2 --> index2
        map1.put("Tanishq", 100);    // hascode1 --> index1 --> equals() --> replace

        System.out.println(map1);
    }
}
class Person{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if(this == null){
            return false;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Person other = (Person) o;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "{ Name: " + name + ", ID: " + id + " }";
    }
}
