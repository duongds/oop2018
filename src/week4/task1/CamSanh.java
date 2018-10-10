package week4.task1;

public class CamSanh extends Cam {
    private  int SoLuongNhap;
    private  String NoiBan;
    //TOdo: Khai Báo phương thức

    @Override
    public int getamout() {
        return super.getamout();
    }

    public int getSoLuongNhap() {
        return this.SoLuongNhap;
    }

    public String getNoiBan() {
        return this.NoiBan;
    }

    public void setNoiBan(String noiBan) {
        this.NoiBan=noiBan;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.SoLuongNhap= soLuongNhap;
    }
    public void Yeucaunhap()
    {
        if(getamout()<100) System.out.println("So luong can nhap" + getSoLuongNhap());
    }
    @Override
    public void PrintNgayNhap() {
        super.PrintNgayNhap();
    }

    @Override
    public String toString() {
        return getamout() +" " + getOrigin() + " " + getNgayNhap()+" "+ getNoiBan();
    }
}
