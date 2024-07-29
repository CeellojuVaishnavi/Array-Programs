package Prac_6;

public class Reverse {
    public static void main(String[] args){
        int[]a={2,4,6,8,10};
        int temp;
        int n=a.length;
        for(int i=0;i<n/2;i++){
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        for(int j=0;j<n;j++){
            System.out.println(a[j]);
        }
    }
    
}
