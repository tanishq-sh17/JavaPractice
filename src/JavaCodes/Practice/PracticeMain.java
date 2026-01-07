package JavaCodes.Practice;

import JavaCodes.Practice.Student;

import java.util.Arrays;

public class PracticeMain {
    public static void main(String[] args) {
        Student[] sarr = new Student[4];
        sarr[0] = new Student("abc", 7);
        sarr[1] = new Student("cds", 8);
        sarr[2] = new Student("dfds", 4);
        sarr[3] = new Student("csds", 6);

        Arrays.sort(sarr);
        for(int i=0; i<sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }

    }
}
