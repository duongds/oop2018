package week11;

public class Task1 {
    public <T> void swap(T[]arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public <T extends Comparable<T>> void Sort(T[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j].compareTo(arr[min]) <= 0) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public <T> void Print(T[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] abc){
        Task1 DS=new Task1();
        Byte[] B={1,0};
        Integer[] I ={3,11,7,1,22,61};
        Double[] F={3.51,9.6,16.9,1.2,24.3,3.4};
        Character[] C={'a','f','m','c','k','d'};
        DS.Sort(C);
        DS.Print(C);
    }
}
