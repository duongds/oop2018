package week5_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Layer extends JPanel implements ActionListener {
    public Timer t = new Timer(10, this);
    public final int shapeCount = 20;
    public ArrayList<Shape> layer = new ArrayList<>();
    /**
     * khỏi tạo layer
     */
    public Layer(){
        int i = 0;
        Random ran = new Random();
        while(i<= shapeCount){
            int j = ran.nextInt(3);
            if(j == 3){
                layer.add(new Rectangle());
            }
            else if(j== 2){
                layer.add(new Square());
            }
            else if(j== 1){
                layer.add(new Circle());
            }
            else if(j==0){
                layer.add(new Triangle());
            }
            i++;
        }


    }

    /**
     * vẽ hình
     * @param g
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Shape sh : layer) {
            if (sh instanceof Circle) {

                Circle c = (Circle) sh;
                g.setColor(c.getColor());
                g.fillOval(c.startPoint.getX(), c.startPoint.getY(), c.getRadius(), c.getRadius());


            } else if (sh instanceof Rectangle) {

                if (sh instanceof Square) {
                    Square s = (Square) sh;
                    g.setColor(s.getColor());
                    g.fillRect(s.startPoint.getX(), s.startPoint.getY(), s.getside(), s.getside());
                } else {
                    Rectangle r = (Rectangle) sh;
                    g.setColor(r.getColor());
                    g.fillRect(r.startPoint.getX(), r.startPoint.getY(), r.getLength(), r.getWidth());

                }
            }
            else if(sh instanceof Triangle){
                Triangle t = (Triangle) sh;
                g.setColor(t.getColor());
                g.fillPolygon(new int[]{t.getP1().getX(),t.getP2().getX(),t.getP3().getX()},
                        new int[]{t.getP1().getY(),t.getP2().getY(),t.getP3().getY()},3);

            }
        }








        t.start();


    }

    /**
     * hiện hình di chuyển
     */

    public void actionPerformed(ActionEvent e){
        for(Shape sh : layer){
            sh.move();
        }
        repaint();

    }
    public void removeTriangle(){
        int i ;
        for(i=0;i<layer.size();i++){

            if(layer.get(i) instanceof Triangle){
                layer.remove(i);
                i--;
            }
        }

    }
    public void removeCircle(){
        int i ;
        for(i=0;i<layer.size();i++){

            if(layer.get(i) instanceof Circle){
                layer.remove(i);
                i--;
            }
        }

    }

}