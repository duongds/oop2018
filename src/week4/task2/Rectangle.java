package week4.task2;

public class Rectangle extends Shape {
    private int width;
    private int length;

    /**
     * hàm tạo mặc định. các thuộc tính mặc định giá trị 1.0
     */
    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    /**
     * hàm tạo có 2 tham số truyền vào
     * @param width chiều dài
     * @param length  chiều rộng
     */
    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    /**
     * hàm tạo có 4 tham số truyền vào
     * @param width chiều dài
     * @param length chiều rộng
     * @param color màu sắc
     * @param filled thuộc tính filled
     */
    public Rectangle(int width, int length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * phương thức tính diện tích hình chữ nhật
     * @return  diện tích hình chữ nhật
     */
    public int getArea(){
        return this.width * this.length;
    }

    /**
     * phương thức tính chu vi hình chữ nhật
     * @return  chu vi hình chữ nhật
     */
    public int getPerimeter(){
        return (this.length + this.width)*2;
    }

    @Override
    public String toString() {
        return  getColor()+ " " + isFilled()+" " +this.length +" "+ this.width;
    }
}
