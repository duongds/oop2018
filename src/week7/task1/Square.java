package week7.task1;

public class Square extends Expression{
    private Expression expression;

    /**
     * Phương thức khởi tạo với tham số ds
     * @param ds: tham số
     */
    public Square(Expression ds){
        this.expression  = ds;
    }

    @Override
    public String toString() {
        return "("+this.expression.toString()+")"+"^2";
    }

    @Override
    public int evaluate()  {
        return expression.evaluate()* expression.evaluate();
    }
}
