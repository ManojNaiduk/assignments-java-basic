import java.util.*;
public class SumAndProductOfMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r1;
        int r2;
        int c1;
        int c2;
        System.out.println("enter row value for matrix1");
        r1=s.nextInt();
        System.out.println("enter column value for matrix1");
        c1=s.nextInt();       
        int arr1[][];
        arr1=new int[r1][c1];
        System.out.println("enter value for matrix 1: ");
        for(int i=0;i< r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.println("enter row value for matrix2");
        r2=s.nextInt();
        System.out.println("enter column value for matrix2");
        c2=s.nextInt();
        int arr2[][];
        arr2=new int[r2][c2];
        System.out.println("enter value for matrix 2: ");
        for(int i=0;i< r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                
                arr2[i][j]=s.nextInt();
            }
        }
        if(r1==r2&&c1==c2){
        add(arr1, arr2, r1, c1);
        }
        else{
            System.out.println(" addition is not possible");
        }
        multiply(arr1, arr2, r1, r2, c1, c2);
        s.close();
    }
    public static void add(int arr1[][],int arr[][],int r, int c){
        int arr3[][];
        arr3= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr3[i][j]=arr1[i][j]+arr[i][j];
            }
        }
        System.out.println("the sum of two matrices is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void multiply(int arr1[][],int arr2[][],int r1,int r2,int c1,int c2)
    {
        if(r2 != c1){
            System.out.println("we cannot mutlipy the two matrices");
    
        }
        else{
            int prod[][]=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<r2;k++)
                    {
                        prod[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("the matrix multiplication: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
}