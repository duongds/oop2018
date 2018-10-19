package week5_6;

public class Point {
    int x;
    int y;
    public Point(int x, int y){

    }
    /**
     * phương thức tính khoảng cách giữa 2 điểm
     * @param other điểm cần tính khoảng cách
     * @return  khoảng cách cần tính
     */
    public double Distance(Point other){
        double temp1 = Math.pow(this.x- other.x,2);
        double temp2 = Math.pow(this.y-other.y,2);
        return Math.sqrt(temp1 + temp2);
    }
}

