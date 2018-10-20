package week5_6;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Layer extends JPanel {
    private ArrayList<Shape> listShape = new ArrayList<Shape>();

    public Layer() {
        listShape.add(0, new Circle());
        listShape.add(1, new Circle());
        listShape.add(2, new Circle());
        listShape.add(3, new Rectangle());
        listShape.add(4, new Rectangle());
        listShape.add(5, new Square());
        Diagram.getMainFrame().add(this);
    }
    public void Show () {
        int Load = 0;
        System.out.println("Số hình trong list: " + listShape.size());
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < listShape.size(); i++) {
                listShape.get(i).Update();
            }
            this.repaint();
            Load++;
            if (Load == 100) {
                //this.D
                System.out.println("Số hình trong list sau khi xóa hình tròn: " + listShape.size());
            }
        }
    }
    /**
     * xóa các hinh tam giac
     */
    public void DeleteTritangle () {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                i--;
            }
        }
    }

    /**
     * xóa các hinh tron
     */
    public void DeleteCircle () {
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                listShape.remove(i);
                i--;
            }
        }
    }
    /**
     * hàm vẽ các đối tượng
     * @param g
     */

    public void panit (Graphics g){
        super.paint(g);
        setBackground(new Color(0xE2CE99));
        for (int i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle) {
                g.setColor(listShape.get(i).getColor());
                int i1 = ((Circle) listShape.get(i)).getRadius();
                g.fillOval(((Circle) listShape.get(i)).getTam().getX(), ((Circle) listShape.get(i)).getTam().getY(), i1, i1);
            } else {
                if (listShape.get(i) instanceof Rectangle) {
                    if (listShape.get(i) instanceof Square) {
                        g.setColor(listShape.get(i).getColor());
                        int s = ((Square) listShape.get(i)).getSide();
                        g.fillRect(((Square) listShape.get(i)).getStart().getX(), ((Square) listShape.get(i)).getStart().getY(), s, s);
                    } else {
                        g.setColor(listShape.get(i).getColor());
                        int w = ((Rectangle) listShape.get(i)).getWidth();

                        int h = ((Rectangle) listShape.get(i)).getLength();
                        g.fillRect(((Rectangle) listShape.get(i)).getStart().getX(), ((Rectangle) listShape.get(i)).getStart().getY(), w, h);
                    }
                }
            }
        }
    }

}