package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void Test1() throws NullPointerException {
        String duong = null;
        try {
            if(duong.equals("ds")){
                System.out.println("bằng nhau");
            }
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public void Test2() throws ArrayIndexOutOfBoundsException{
        String[] str = new String[]{"A" , "B", "C"};
        try {
            System.out.println(str[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public void Test3()throws ArithmeticException{
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }

    public void Test4()throws ClassCastException{
        Object a = new String("A");
        try {
            System.out.println((int)a);
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }

    }
    public void Test5()throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Duong.TDT"));
        while (sc.hasNextInt()) {
            int ds = sc.nextInt();
            System.out.println(ds);
        }

    }
    public void Test6()throws IOException{
        Scanner sc = new Scanner(new File("C:\\Duong.TDT"));
        while (sc.hasNextInt()){
            int ds1 = sc.nextInt();
            System.out.println(ds1);
        }
    }
    public static void main(String[] abc)  {
        Task2 Test  = new Task2();
        Test.Test1();
        Test.Test2();
        Test.Test3();
        Test.Test4();

        try {
            Test.Test5();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        try {
            Test.Test6();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}