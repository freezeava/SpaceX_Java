import java.util.Scanner;

public class Patt3 {


    public static void triPatt2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter nos of row");
    int n=sc.nextInt();

    triPatt2(n);

    
    
    
   }
    
}
