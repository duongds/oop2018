package week5_6;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Diagram extends JFrame {

    private static JFrame mainFrame = new JFrame("Test");

    private ArrayList<Layer> listLayer = new ArrayList<>();
    public static JFrame getMainFrame() {
        return mainFrame;
    }


    public void deleteCricle(){

    }

    /**
     * phương thức thêm 1 đối tượng lớp layer vào diagram
     * @param other đối tượng cần thêm
     */
    public void addLayer(Layer other){
        listLayer.add(other);
    }

    public static void main(String[] args){
        List<Layer> list = new ArrayList<>();
        list.add(new Layer());
        mainFrame.setBounds(100,10,700,700);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        list.get(0).Show();

    }

}
