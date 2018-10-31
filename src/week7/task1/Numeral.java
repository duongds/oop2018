package week7.task1;

public class Numeral extends Expression {
    private int value;

    /**
     * Phương thức khởi tạo Numeral
     */
    public Numeral() {
        value = 0;
    }

    /**
     * Phương thức khởi tạo Numeral với tham số ds
     * @param ds : tham số
     */
    public Numeral(int ds) {
        this.value = ds;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int evaluate() {
        return value;
    }
}


