package week4.task2;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    //TODO: Khai báo phương thức getter , setter
    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    /**
     * hàm tạo có 1 tham số
     * @param side  độ dài 1 cạnh của hình vuông
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * phương thức khởi tạo 3 tham số
     * @param side  độ dài 1 cạnh của hình vuông
     * @param color màu sắc
     * @param filled    thuộc tính filled
     */
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    /**
     * ghi đè lại phương thức toString ở lớp cơ sở
     * @return  mặc định ở đây là Square.
     */
    @Override
    public String toString() {
        return "Square";
    }
}
