import java.util.Scanner;

public class NumPatt3 {

    public static void numPatt3(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"  ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows n: ");
        int n=sc.nextInt();

        numPatt3(n);
    }
    
}
