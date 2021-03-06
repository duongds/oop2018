package week2.task2;
import week2.task1.Task1;
public class Fraction {

    private  int numerator;
    private int denominator;
    // TODO: khai bao thuoc tinh


    public Fraction(int numerator, int denominator) {
        if(denominator == 0){
            System.out.println("Error: Invalid Denominator!");
        }
        else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
        // TODO: khoi tao giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public void Toigian()
    {
        int GCD =Task1.gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator/= GCD;
        this.denominator/=GCD;
        // TODO: Tối giản phân số
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
        this.denominator=denominator;
    }
    // Getter và setter

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

    public String PrintFraction(){
        String temp = "";
        if(this.denominator==1){
            temp = Integer.toString(this.numerator);
        }
        else if(this.denominator==-1){
            this.numerator*=-1;
            temp = Integer.toString(this.numerator);
        }
        else if(this.numerator==this.denominator){
            temp = "1";
        }
        else if(this.numerator==-this.denominator){
            temp = "-1";
        }
        else if(this.numerator==0){
            temp = "0";
        }
        else if(this.denominator<0){
            this.numerator*=-1;
            this.denominator*=-1;
            temp  = Integer.toString(this.numerator)+"/" +Integer.toString(this.denominator);
        }
        else temp = Integer.toString(this.numerator)+ "/"+Integer.toString(this.denominator);
        return temp;

        // TODO: Hàm in ra phân số
    }
    public boolean equals(Object obj) {
        Fraction ds = (Fraction) obj;
        int Temp = (this.numerator*ds.denominator) - (this.denominator*ds.numerator);
        if( Temp == 0) return true;
        return false;
        // TODO: so sánh phân số
    }
    public static void main(String Args[]) {
        Fraction DS1 = new Fraction(1, 2);
        Fraction DS2 = new Fraction(2, 3);
        Fraction Add = DS1.add(DS2);
        Fraction Sub = DS1.subtract(DS2);
        Fraction Mul = DS1.multiply(DS2);
        Fraction Div = DS1.divide(DS2);
        System.out.print("Add : ");
        System.out.println(Add.PrintFraction());
        System.out.print("Subtract : ");
        System.out.println(Sub.PrintFraction());
        System.out.print(" Mul : ");
        System.out.println(Mul.PrintFraction());
        System.out.print("Divide : ");
        System.out.println(Div.PrintFraction());
        // equals
        System.out.print("Equals Result :");
        boolean result = DS1.equals(DS2);
        if (result == true) System.out.print(" Equal ! ");
        else System.out.print(" Unequal ! ");
    }
}
