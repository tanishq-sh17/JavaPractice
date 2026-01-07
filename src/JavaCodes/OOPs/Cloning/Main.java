package JavaCodes.OOPs.Cloning;

public class Main {
    static void main(String[] args) throws CloneNotSupportedException {
        Human tanishq = new Human(22, "Tanishq");

        Human twin = (Human) tanishq.clone();
        System.out.println(twin.toString());
    }
}
