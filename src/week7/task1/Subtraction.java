package week7.task1;

public class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;
    public Subtraction(Expression left, Expression right) {
        this.right=right;
        this.left=left;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String toString() {
        return this.left.toString() +" - "+ this.right.toString();
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
}
