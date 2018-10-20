package week4.task2;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    //TODO: Khai báo phương thức getter , setter
    public int getSide(){
        return super.getWidth();
    }

    public void setSide(int side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(int side) {
        super.setLength(side);
    }

    /**
     * hàm tạo có 1 tham số
     * @param side  độ dài 1 cạnh của hình vuông
     */
    public Square(int side){
        super(side,side);
    }
    /**
     * phương thức khởi tạo 3 tham số
     * @param side  độ dài 1 cạnh của hình vuông
     * @param color màu sắc
     * @param filled    thuộc tính filled
     */
    public Square(int side,String color,boolean filled){
        super(side,side,color,filled);
    }

    @Override
    public String toString()
    {
        return getColor()+ " " + isFilled()+" " +getLength() +" "+ getWidth();
    }
}
