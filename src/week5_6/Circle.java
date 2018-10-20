package week5_6;

import java.util.Random;

public class Circle extends Shape {
    private int radius;
    private Point Tam = new Point();
    private Point SpeedXY = new Point();

    /**
     * ham khởi tạo
     */
    public Circle() {
        Random rd = new Random();
        radius = rd.nextInt(150);
        Tam.setY(rd.nextInt(150));
        Tam.setX(rd.nextInt(150));
        SpeedXY.setY(rd.nextInt(15));
        SpeedXY.setX(rd.nextInt(15));
    }

    /**
     * hàm tra vể bán kinh hinht tròn
     *
     * @return bán kinh hinh tròn
     */
    public int getRadius() {
        return radius;
    }

    /**
     * đặt giá trị bán kính
     *
     * @param radius bán kính hinh tron
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public void Update() {
        if(Tam.getX() > Diagram.getMainFrame().getWidth() - radius - 15){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(Tam.getX() <= 0){
            SpeedXY.setX(-SpeedXY.getX());
        }
        if(Tam.getY() <= 0 ){
            SpeedXY.setY(-SpeedXY.getY());
        }
        if(Tam.getY() > Diagram.getMainFrame().getHeight() - radius - 35){
            SpeedXY.setY(-SpeedXY.getY());
        }
        Tam.setX(Tam.getX()+SpeedXY.getX());
        Tam.setY(Tam.getY()+SpeedXY.getY());

    }

    public void setTam(Point tam) {
        Tam = tam;
    }

    public Point getTam() {
        return Tam;
    }
}

