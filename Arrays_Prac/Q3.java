import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];

        int[][] newArr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Scanner sc=new Scanner(System.in);

        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int val = sc.nextInt();
                arr[i][j]=val;
            }
        }
    
        int[][] addArr=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                addArr[i][j]=arr[i][j]+newArr[i][j];
            }
        }

        System.out.println("Printing that added 2 arrays sum: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(addArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
