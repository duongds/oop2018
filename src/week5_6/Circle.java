package week5_6;

import java.awt.*;
import java.util.Random;

public class Circle extends Shape {
    private int radius;


    /**
     * hàm khởi tạo hình tròn
     */
    public Circle(){
        Random ran = new Random();
        this.radius = ran.nextInt(100);
        this.startPoint.setX(ran.nextInt(30));
        this.startPoint.setY(ran.nextInt(30));
        this.speed.setX( ran.nextInt(7));
        this.speed.setY( ran.nextInt(7));
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));


    }

    /**
     *
     * @return độ dài bán kính
     */
    public int getRadius() {
        return radius;
    }

    /**
     *
     * @param radius : độ dài bán kính muốn thiết lập
     */

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * hàm di chuyển
     */
    @Override
    public void move() {
        super.move();
    }
}
