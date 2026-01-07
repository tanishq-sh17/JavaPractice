package JavaCodes.CollectionFramework.HashMapp;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
//        String key1 = new String("img1");
//        String key2 = new String("img2");
//        String key1 = "img1";
//        String key2 = "img2";
//        imageCache.put(key1, new Image("Image1"));
//        imageCache.put(key2, new Image("Image2"));
        loadCache(imageCache);
        System.out.println(imageCache);
//        key1 = null;
//        key2 = null;
        simulateApplicationRunning();
        System.gc();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    private static void loadCache(WeakHashMap<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");   // by using k1 and k2 in this method and then even after
                                         // creating a strong reference of k1 and k2 then also GC is destroying
                                        // them because of the scope of this method

        imageCache.put(k1, new Image("Image1"));
        imageCache.put(k2, new Image("Image2"));
    }

    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulating application");
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}