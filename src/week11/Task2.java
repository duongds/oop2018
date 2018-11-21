package week11;

public class Task2 {
    public<T extends Comparable<T>> void MaxArr(T[]arr){
        int n=arr.length;
        T max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i].compareTo(max)> 0){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] abc){
        Task2 Test=new Task2();
        Byte[] B={1,0};
        Integer[] I ={3,11,7,1,22,61};
        Double[] F={3.51,9.6,16.9,1.2,24.3,3.4};
        Character[] C={'a','f','m','c','k','d'};
        Test.MaxArr(F);
    }
}
