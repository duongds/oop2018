package week5_6;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public  class Shape extends JPanel {
    protected Color color;
    protected Point startPoint = new Point();
    protected Point speed   = new Point();
    Random ran = new Random();
    protected int temp = ran.nextInt(10);


    /**
     *
     * @return trả về màu
     */
    public Color getColor() {
        return color;
    }

    /**
     * đặt màu
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * di chuyển hình ảnh
     */
    public  void move(){
        if(startPoint.getX()<0 || startPoint.getX() > 500){
            speed.setX(-speed.getX());
        }
        if(startPoint.getY()<0 || startPoint.getY() > 500){
            speed.setY(-speed.getY());
        }
        startPoint.setX(startPoint.getX() + speed.getX());
        startPoint.setY(startPoint.getY() + speed.getY());
    }
}