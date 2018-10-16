package week4.task1;

/**
<<<<<<< Updated upstream
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    //TODO: khai bao thuoc tinh
    protected String name;
    protected int amout;
    protected String Origin;
    //TODO: khai bao phuong thuc
    public String getname() {
        return this.name;
    }
    public void setName(String ds)
    {
        this.name=ds;
    }
    public int getamout()
    {
        return this.amout;
    }
    public void setAmout(int ds)
    {
        this.amout=ds;
    }

    public String getOrigin() {
        return this.Origin;
    }

    public void setOrigin(String origin) {
        this.Origin = origin;
    }

    public void PrintName()
    {
        System.out.println("Name is "+this.name);
    }
    public void PrintOrigin()
    {
        System.out.println("Origin is " +this.Origin);
    }
    public  void PrintAmout()
    {
        System.out.println("Amout is "+ getamout());
    }
    @Override
    public String toString() {
        return getamout() +" " +getOrigin();
    }
    public  static void main(String afd[]) {
        Cam newcam = new Cam();
        Apple newApple = new Apple();
        Cam_caophong cam1 = new Cam_caophong();
        CamSanh CAM2 = new CamSanh();
        newcam.setNgayNhap("21/4/2013");
        newcam.setAmout(234);
        newcam.PrintNgayNhap();
        newApple.setAmout(453);
        newApple.setNgayNhap("33/2/2017");
        newApple.PrintNgayNhap();
        cam1.setAmout(32);
        cam1.setSoLuongNhap(500);
        cam1.Yeucaunhap();
        CAM2.setAmout(423);
        CAM2.setSoLuongNhap(433);
        CAM2.Yeucaunhap();

    }
}
