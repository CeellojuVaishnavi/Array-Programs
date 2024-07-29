package Prac_6;

public class Find_max {
    public static void main(String[] args){
        int[]a={2,7,4,6,3};
        int i,pos=0;
        int n=a[0];
        for(i=1;i<a.length;i++){
            if(n<a[i]){
                n=a[i];
                pos=i+1;
            }
        }
        System.out.println("Maximum element is "+n+" and is in position "+pos);
    }
    
}
