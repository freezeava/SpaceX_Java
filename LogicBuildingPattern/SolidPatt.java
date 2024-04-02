import java.util.Scanner;

public class SolidPatt {


    public static void solidRhm(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows n: ");
        int n=sc.nextInt();

        solidRhm(n);
    }
    
}
