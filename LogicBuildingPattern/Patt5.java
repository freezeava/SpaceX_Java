import java.util.Scanner;

public class Patt5 {


    public static void triPatt4(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter nos of row");
    int n=sc.nextInt();
    triPatt4(n);
    
    
   }
    
}
