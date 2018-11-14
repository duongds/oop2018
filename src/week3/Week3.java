package week3;

/**
 * Class làm bài tập week3
 */
public class Week3 {

    /**
     * Phương thức tim giá trị lớn nhất của hai số nguyên.
     * @param m là só thứ nhất
     * @param n là số thứ hai
     * @return giá trị lớn nhất của hai số m và n
     */
    public static int max(int m, int n) {
        if(m>=n) return m;
        else return n;
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

    }

    /**
     * phương thức để in ra ds
     */
    public void asd(){
        System.out.println("dd");
    }
    /**
     * Phương thức tìm giá trị nhỏ nhất của một mảng số nguyên
     * @param array là mảng số nguyên
     * @return giá trị nhỏ nhất của mảng số nguyên
     */
    public static int minOfArray(int[] array) {
        int i, min=array[0];
        for(i=1;i<array.length;i++){
            if(array[i]<min)
            {
                min =array[i];
            }
        }
        return  min;
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)

    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/ (height*height);
        String out=" ";
        if ( BMI<18.5){
            out ="Thiếu cân";
        }
        if ( 18.5<=BMI&& BMI<=22.99){
            out ="Bình thường";
        }
        if ( BMI>=23&&BMI<=24.99){
            out ="Thừa cân";
        }
        if ( BMI>=25){
            out ="Béo phì";
        }
        return out;
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá

    }
    public static  void main(String ads[])
    {

        System.out.print(calculateBMI(70,1.7));

    }
}
