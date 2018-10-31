package week7.task1;

public class Addition extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Addition (Expression left, Expression right){
        this.right=right;
        this.left=left;
    }
    @Override
    public Expression left(){
        return this.left;
    }

    public Expression right(){
        return  this.right;
    }

    @Override
    public String toString() {
        return this.left.toString() + " + " + this.right.toString();
    }
    @Override
    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }
}
