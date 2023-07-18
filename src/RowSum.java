import java.util.Scanner;
import java.util.Arrays;


class Solution{
    public int[] rowcount(int[][] arr){
        int ro =arr.length;
        int col = arr[0].length;
        int[] array = new int[ro];
        for(int i=0;i<ro;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum = sum+arr[i][j];
            }
            array[i] = sum;
        }
        return array;
    }
}

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        System.out.println(Arrays.toString(answer.rowcount(arr)));
    }
}
