package week4.task1;

public class Apple extends HoaQua {
    // Todo: Khai báo thuộc tính
    private String NgayNhap;
    private String TypeOfApple;
    //Todo: Khai báo phương thức
    public  String getNgayNhap()
    {
        return this.NgayNhap;
    }
    public  void setNgayNhap(String NgayNhap)
    {
        this.NgayNhap= NgayNhap;
    }
    public String getTypeOfApple()
    {
        return  this.TypeOfApple;
    }
    public void setTypeOfApple(String ds)
    {
        this.TypeOfApple= ds;
    }
    public void PrintNgayNhap()
    {
        System.out.println("Ngay nhap : "+getNgayNhap());
    }
    @Override
    public int getamout() {
        return super.getamout();
    }

    @Override
    public String getOrigin() {
        return super.getOrigin();
    }

    @Override
    public String toString() {
        return  getamout()+ " " + getOrigin() +" " +getNgayNhap();
    }
}
