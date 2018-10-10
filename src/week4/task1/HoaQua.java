package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    //TODO: khai bao thuoc tinh
    private String name;
    private int amout;
    private String Origin;
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
    public void PrintOrigin()
    {
        System.out.println("Origin is " +this.Origin);
    }
}
