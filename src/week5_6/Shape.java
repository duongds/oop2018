package week5_6;

public class Shape {
    private String color;
    private boolean filled;
    // TOdo: Khai báo phương thức getter, setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /**
     * Hàm tạo không có tham số
     * 2 thuộc tính được mặc định giá trị là "Red" và true.
     */
    public Shape(){
        color = "Red";
        filled = true;
    }

    /**
     * Hàm tạo có tham số truyền vào
     * @param color màu sắc muốn khởi tạo
     * @param filled có tô màu hay không
     */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return this.color +" "+ this.filled;
    }
}
