package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    /**
     * Phương thức đọc một file
     * @param path: Đường dẫn đến file
     * @throws FileNotFoundException
     */
    public static void readContentFromFile(String path) throws FileNotFoundException {
        Scanner ds = new Scanner(new File(path));
        String Text;
        while (ds.hasNextLine()){
            Text = ds.nextLine();
            System.out.println(Text);
        }
        ds.close();
    }

    /**
     * Phương thức viết vào file( ghi đè)
     * @param path : Đường dẫn đến file
     */
    public static void writeContentFromFile(String path) {
        try{
            String text= "Duongds1";
            FileWriter file = new FileWriter(path);
            //BufferedWriter wr = new BufferedWriter(file);
            file.write(text);
            file.close();
        }catch(IOException e){
            System.out.println("LOI");
        }

    }

    /**
     * Phương thức viết vào cuối file
     * @param path : Đường dẫn đến file
     * @throws IOException
     */
    public static void WriteFile(String path) throws IOException {
        String text = " Duongds2";
        FileWriter file = new FileWriter(path,true);
        file.write(text);
        file.close();
    }

    /**
     * Phương thức tìm file trong thư mục
     * @param folderPath: Đường dẫn đến folder
     * @param fileName: tên file cần tìm
     */
    public static void findFilebyName(String folderPath,String fileName){
        File dir=  new File(folderPath+ fileName);
        if(dir.exists()){
            if(dir.isFile()){
                if(dir.getName().equals(fileName)){
                    System.out.println(dir.getAbsolutePath());
                }
                else System.out.println("Khong tim thay!");
            }
            File[] listFile = dir.listFiles();
            if(listFile!=null){
                for(File f: listFile){
                    findFilebyName(f.getAbsolutePath(),fileName);
                }
            }
        }
    }
    public static void main(String[] arg) throws IOException {
        String path="E:\\Test\\D.TXT";
        readContentFromFile(path);
        writeContentFromFile(path);
        readContentFromFile(path);
        WriteFile(path);
        readContentFromFile(path);
        findFilebyName("E:\\", "D.TXT");

    }
}
