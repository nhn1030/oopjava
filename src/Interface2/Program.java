package src.Interface2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("oopJavaStudy/src/Interface2/setting.txt");
        Scanner scan = new Scanner(fis);
        String className = scan.nextLine();

        scan.close();
        fis.close();

//        A a = new A();
//        X x = ;
//
//        a.setX(x);
//
//        a.print();
    }
}
