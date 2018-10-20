package week5_6;
import javax.swing.*;
import java.util.ArrayList;

public class Diagram extends JFrame {


    private ArrayList<Layer> listLayer = new ArrayList<>();


    public void deleteCricle(ArrayList<Shape> layer) {
        int i;
        for (i = 0; i < layer.size(); i++) {

            if (layer.get(i) instanceof Circle) {
                layer.remove(i);
                i--;
            }
        }
    }
    /**
     * phương thức thêm 1 đối tượng lớp layer vào diagram
     * @param other đối tượng cần thêm
     */
    public void addLayer(Layer other){
        listLayer.add(other);
    }

    public static void main(String[] args){
        JFrame mainFrame = new JFrame("Week 5");
        Layer layer = new Layer();
        System.out.println("Số hình ban đầu là :"  + layer.layer.size());
        layer.removeTriangle();
        System.out.println("Số hình sau khi xoá tam giác là: " +  layer.layer.size());
        layer.removeCircle();
        System.out.println("Số hình sau khi xoá hình tròn là : " + layer.layer.size());
        mainFrame.add(layer);
        mainFrame.setBounds(100,10,600,600);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
