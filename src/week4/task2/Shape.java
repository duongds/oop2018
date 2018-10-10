package week4.task2;

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

    public static void main(String Args[]){
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        System.out.println("Dien tich hinh chu nhat: "+ rectangle.getArea());
        System.out.println("Chu vi hình chu nhat: "+ rectangle.getPerimeter());
        System.out.println("Dien tich hinh vuong: "+ square.getArea());
        System.out.println("Chu vi hinh vuong: "+ square.getPerimeter());
        System.out.println("Dien tich hinh tron: "+circle.getArea());
        System.out.println("Chu vi hinh tron: "+circle.getPerimeter());
    }
}
