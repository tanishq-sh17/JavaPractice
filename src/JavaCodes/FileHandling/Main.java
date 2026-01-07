package JavaCodes.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some integers: ");
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println();
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr = new FileReader("src/JavaCodes/FileHandling/note.txt")){
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        // byte to char stream and then reading char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){  // here we are taking byte stream and converting it into a char stream
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        // for reading and printing a file
        try(BufferedReader br = new BufferedReader(new FileReader("src/JavaCodes/FileHandling/note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
