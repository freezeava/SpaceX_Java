import java.util.Scanner;

public class Patt2 {

     public static void triPatt1(int n){
        for(int i=1;i<=n;i++){
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

    triPatt1(n);
    
    
   }
    
}
