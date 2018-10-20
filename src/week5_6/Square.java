package week5_6;

import java.awt.*;
import java.util.Random;

/**
 * class hình vuông
 */
public class Square extends Rectangle {
    private int side;


    /**
     * khỏi tạo hình vuông
     */
    public  Square(){
        Random ran  = new Random();
        this.side   = ran.nextInt(70);
        this.startPoint.setX(ran.nextInt(30));
        this.startPoint.setY(ran.nextInt(30));
        this.speed.setX( ran.nextInt(7));
        this.speed.setY( ran.nextInt(7));
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));

    }

    /**
     *
     * @return độ dài cạnh
     */
    public int getside() {
        return side;
    }

    /**
     *
     * @param side đọ dài muốn đưa vào
     */
    public void setside(int side) {
        this.side = side;
    }

    /**
     * di chuyển
     */
    @Override
    public void move() {
        super.move();
    }
}