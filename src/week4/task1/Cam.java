package week4.task1;

public class  Cam extends HoaQua {
    // Todo: Khai báo thuộc tính
    protected String NgayNhap;
    protected String TypeOfCam;
    //Todo: Khai báo phương thức
    public  String getNgayNhap()
    {
        return this.NgayNhap;
    }
    public  void setNgayNhap(String NgayNhap)
    {
        this.NgayNhap= NgayNhap;
    }
    public String getTypeOfCam()
    {
        return  this.TypeOfCam;
    }
    public void setTypeOfCam(String ds)
    {
        this.TypeOfCam= ds;
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
