package week5_6;
import java.lang.Math;
public class Triangle extends Shape  {
    private int DoDaiCanh;

    /**
     * hàm khơi tạo
     * @param a đô dai cạnh
     */
    public Triangle(int a){
        DoDaiCanh = a;
    }

    /**
     * hàm trả về dộ dài
     * @return
     */
    public int getDoDaiCanh() {
        return DoDaiCanh;
    }

    public void setDoDaiCanh(int doDaiCanh) {
        DoDaiCanh = doDaiCanh;
    }

    @Override
    public void Update() {

    }

}
