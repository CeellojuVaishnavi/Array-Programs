package Prac_6;

public class Is_sorted {
    public static void main(String[] args){
        int a[]={1,4,3,4,5,6};
        int flag=0;
        int n=a.length;
        for (int i=0;i<n-1;i++){
           if(a[i]<a[i+1])
           continue;
           else{
            flag=1;
           }

        }
        if (flag==0)
        System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");

    }
    
}



