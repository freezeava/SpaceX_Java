import java.util.Scanner;

public class Patt4 {



    public static void triPatt3(int n){

        for(int i=1;i<=n;i++){
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
    triPatt3(n);
    
    
   }
    
}
