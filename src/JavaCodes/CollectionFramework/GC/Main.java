package JavaCodes.CollectionFramework.GC;

import java.lang.ref.WeakReference;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", "ZX108");
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple", "17"));

        System.out.println(weakReference.get());

        try{
            Thread.sleep(10000);
        } catch (Exception e){

        }
        System.out.println(weakReference.get());
    }


}
