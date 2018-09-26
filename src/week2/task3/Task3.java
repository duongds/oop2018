package week2.task3;

import week2.task1.Task1;

public class Task3 {
    class Fraction {

        private int numerator;
        private int denominator;
        // TODO: khai bao thuoc tinh


        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                System.out.println("Error: Invalid Denominator!");
            } else {
                this.numerator = numerator;
                this.denominator = denominator;
            }
            // TODO: khoi tao giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        }

        public void Toigian() {
            int GCD = Task1.gcd(Math.abs(this.numerator), Math.abs(this.denominator));
            this.numerator /= GCD;
            this.denominator /= GCD;
            // TODO: Tối giản phân số
        }

        public int getNumerator() {

            return this.numerator;
        }

        public void setNumerator(int numerator) {

            this.numerator = numerator;
        }

        public int getDenominator() {

            return this.denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }
        // Getter và setter

        public Fraction add(Fraction other) {
            Fraction temp = new Fraction(0, 1);
            temp.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
            temp.denominator = this.denominator * other.denominator;
            temp.Toigian();
            return temp;
            // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        }

        public Fraction subtract(Fraction other) {
            Fraction temp = new Fraction(0, 1);
            temp.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
            temp.denominator = this.denominator * other.denominator;
            temp.Toigian();
            return temp;
            // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới

        }

        public Fraction multiply(Fraction other) {
            Fraction temp = new Fraction(0, 1);
            temp.numerator = this.numerator * other.numerator;
            temp.denominator = this.denominator * other.denominator;
            temp.Toigian();
            return temp;
            // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        }

        public Fraction divide(Fraction other) {
            Fraction temp = new Fraction(0, 1);
            temp.numerator = this.numerator * other.denominator;
            temp.denominator = this.denominator * other.numerator;
            temp.Toigian();
            return temp;
            // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        }
    }


    class Coder{
        String Name;
        int Age;
        String Sex;
        public  String getName()
        {
            return this.Name;
        }
        public  void setName(String Name)
        {
            this.Name= Name;
        }
        public  String getSex()
        {
            return this.Sex;
        }
        public  void setSex(String Sex)
        {
            this.Sex= Sex;
        }
        public  int getAge(){
            return this.Age;
        }
        public  void setAge(int Age)
        {
            this.Age=Age;
        }
        public  void Hello(){
            System.out.println("Hi! My name is" + this.Name);
        }
        public void Code(){
            System.out.println("I am coding !");
        }
        public  void sleep(){
            System.out.println("Go sleep !");
        }
    }
    class Dog{
        String Name;
        String User;
        int Age;
        public String getName(){
            return this.Name;
        }

        public void setName(String Name) {
            this.Name=Name;
        }
        public String getUser(){
            return  this.User;
        }

        public void setUser(String User) {
            this.User = User;
        }
        public int getAge() {
            return this.Age;
        }
        public void setAge(int Age){
            this.Age= Age;
        }
        public  void Mysen(){
            System.out.println("My sen is" +User);
        }
        public void Hungry(){
            System.out.println("Gâu gâu gâu gâu gâu!");
        }
        public void LookatUser(){
            System.out.println(" Sen! Where are you now?");
        }
    }

}

//TODO: khai
