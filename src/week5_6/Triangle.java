package week5_6;
import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Triangle extends Shape {
    private Point p1 = new Point();
    private Point p2 = new Point();
    private Point p3 = new Point();
    public Triangle(){
        Random ran  = new Random();
        this.p1.setX(ran.nextInt(10));
        this.p1.setY(ran.nextInt(10));
        this.p2.setX(ran.nextInt(50));
        this.p2.setY(ran.nextInt(50));
        this.p3.setX(ran.nextInt(90));
        this.p3.setY(ran.nextInt(90));
        this.speed.setX( ran.nextInt(7)+1);
        this.speed.setY( ran.nextInt(7)+1);
        this.color   = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void move(){
        int gX = (p1.getX() + p2.getX() + p3.getX()) /3;
        int gY = (p1.getY() + p2.getY() + p3.getY()) /3;
        if(gX < 0 || gX > 500){
            speed.setX(-speed.getX());
        }
        if(gY < 0 || gY > 500){
            speed.setY(-speed.getY());
        }
        p1.setX(p1.getX() + speed.getX());
        p2.setX(p2.getX() + speed.getX());
        p3.setX(p3.getX() + speed.getX());
        p1.setY(p1.getY() + speed.getY());
        p2.setY(p2.getY() + speed.getY());
        p3.setY(p3.getY() + speed.getY());


    }

}
