import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size or row");
        int row=s.nextInt();
        System.out.println("enter size of column");
        int col=s.nextInt();
        int arr[][];
        arr=new int[row][col];
        System.out.println("enter the values:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("the matrix is: ");
        for(int i=0;i< row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        int temp[][];
        temp=new int[col][row];
        System.out.println("the transpose matrix is ");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                temp[i][j]=arr[j][i];
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        s.close();

    }
}