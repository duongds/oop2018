package week4.task1;

public class  Cam extends HoaQua {
    // Todo: Khai báo thuộc tính
    private String Xuatxu;
    private String TypeOfCam;
    //Todo: Khai báo phương thức
    public  String getXuatxu()
    {
        return this.Xuatxu;
    }
    public  void setXuatxu(String xuatxu)
    {
        this.Xuatxu= xuatxu;
    }
    public String getTypeOfCam()
    {
        return  this.TypeOfCam;
    }
    public void setTypeOfCam(String ds)
    {
        this.TypeOfCam= ds;
    }
    public void PrintXuatXu()
    {
        System.out.println("Xuat xu : "+getXuatxu());
    }
}
