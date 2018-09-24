package week2.task2;
import week2.task1.Task1;
public class Fraction {

    private  int numerator;
    private int denominator;
    // TODO: khai bao thuoc tinh

    public void Toigian()
    {
        int GCD =Task1.gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator/= GCD;
        this.denominator/=GCD;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // TODO: khoi tao giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
        Fraction temp= new Fraction(0,1);
        temp.numerator= this.numerator * other.denominator+this.denominator*other.numerator;
        temp.denominator=this.denominator*other.denominator;
        temp.Toigian();
        return temp;
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction subtract(Fraction other) {
        Fraction temp= new Fraction(0,1);
        temp.numerator= this.numerator * other.denominator-this.denominator*other.numerator;
        temp.denominator=this.denominator*other.denominator;
        temp.Toigian();
        return temp;
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public Fraction multiply(Fraction other) {
        Fraction temp= new Fraction(0,1);
        temp.numerator= this.numerator * other.numerator;
        temp.denominator=this.denominator*other.denominator;
        temp.Toigian();
        return temp;
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction divide(Fraction other) {
        Fraction temp= new Fraction(0,1);
        temp.numerator= this.numerator * other.denominator;
        temp.denominator=this.denominator*other.numerator;
        temp.Toigian();
        return temp;
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
    }
    public  int getNumerator()
    {
        return  this.numerator;
    }
    public  void setNumerator(int numerator)
    {
        this.numerator=numerator;
    }
    public  int getDenominator() {
        return this.denominator;
    }
    public void setDenominator(int denominator){
        this.denominator;
    }
}
