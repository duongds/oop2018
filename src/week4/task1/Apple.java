package week4.task1;

public class Apple extends HoaQua {
    // Todo: Khai báo thuộc tính
    private String Xuatxu;
    private String TypeOfApple;
    //Todo: Khai báo phương thức
    public  String getXuatxu()
    {
        return this.Xuatxu;
    }
    public  void setXuatxu(String xuatxu)
    {
        this.Xuatxu= xuatxu;
    }
    public String getTypeOfApple()
    {
        return  this.TypeOfApple;
    }
    public void setTypeOfApple(String ds)
    {
        this.TypeOfApple= ds;
    }
    public void PrintXuatXu()
    {
        System.out.println("Xuat xu : "+getXuatxu());
    }
}
