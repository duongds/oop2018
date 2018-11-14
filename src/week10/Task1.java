package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public List<String> getAllFunctions(String path) throws FileNotFoundException {
        List<String> dsFile = new ArrayList<String>();
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            String st1 = sc.nextLine();
            if (st1.indexOf("static") != 1 && st1.endsWith("{")) {
                int temp = 1;
                while (temp != 0) {
                    String st2 = sc.nextLine();
                    st1 = st1 + "/n" + st2;
                    if (st1.indexOf("{") != -1) {
                        temp++;
                    }
                    if (st1.indexOf("}") != -1) {
                        temp--;
                    }
                }
                dsFile.add(st1);

            }

        }
        return dsFile;
    }

    public String findFunctionbyName(String name) throws FileNotFoundException {
        Task1 task1 = new Task1();
        List<String> ListFuctions = task1.getAllFunctions("src/week9/Utils.java");
        String Name = name.substring(0, name.indexOf("("));
        for (int i = 0; i < ListFuctions.size(); i++) {
            if (ListFuctions.get(i).indexOf(Name) != -1) {
                return ListFuctions.get(i);
            }
        }
        return null;

    }

    public static void main(String[] args) throws FileNotFoundException {
        Task1 test = new Task1();

        System.out.println(test.findFunctionbyName("findFilebyName"));
    }
}
