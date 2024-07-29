package Prac_6;

public class Mat_sum {
    public static void main(String[] args){
        int [][]a={{1,2,3},{1,2,3}};
        int [][]b={{4,5,6},{4,5,6}};
        int [][]sum=new int[2][3];
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print((sum[i][j])+" ");
            }
            System.out.print("\n");
        }

    }
    
}
