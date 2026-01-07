package JavaCodes.CollectionFramework.HashMapp;

public class Hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }
    public static int simpleHash(String key){
        int sum = 0;
        for(char ch : key.toCharArray()){
            sum += (int) ch;
        }
        return sum % 10;
    }
}
