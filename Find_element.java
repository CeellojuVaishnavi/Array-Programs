package Prac_6;
/* 
public class Find_element {
    public static void main(String[] args){
        //float[]a=new float[5];
        float[]a={2.2f,4.5f,6.4f,8.6f,10.23f};
        float sum=0;
        for (float i:a){
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
    
}
*/
import java.util.Scanner;
public class Find_element {

    public static void main(String[] args){
        int []a={2,4,6,8,10};
        int loc=0;
        int j=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element to be searched :");
        int c=s.nextInt();
        for(int i=0;i<a.length;i++){
            loc+=1;
            if(a[i]==c){
                System.out.printf("Element present in the array at %d location",loc);
                j=1;
                break;
            }

        }
        if(j==0){
            System.out.println("Element not found in the array");
        }


    }
}
