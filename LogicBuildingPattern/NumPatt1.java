import java.util.Scanner;

public class NumPatt1 {


    public static void numPatt1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter nos of row");
    int n=sc.nextInt();
    numPatt1(n);
    
    
   }
    
}
