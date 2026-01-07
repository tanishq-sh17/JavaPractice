package JavaCodes.SealedClasses;


public sealed class A permits B, C, D {

    void print(){
        System.out.println("Hello A");
    }
    public void gretting(){
        System.out.println("Hii, A");
    }
}
