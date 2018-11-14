package week10;

import java.util.Random;

public class Task2 {
    public void SortArray(double ds[])
    {
        for(int i = 0; i < ds.length; i++)
        {
            for(int j = 0; j < ds.length-i-1 ; j++){
                if (ds[j] > ds[j + 1]) {
                    double temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }

    }
    public static void main(String[] ard){
        double test[] = new double[1000];
        Random rd = new Random();
        for (int i=0;i< 1000;i++){
            test[i]= rd.nextInt(1000)*rd.nextDouble();
        }
        Task2 Test = new Task2();
        Test.SortArray(test);
        for(int i=0;i<100;i++){
            System.out.println(test[i]);
        }

    }

}
