import java.util.Scanner;

public class HollowRectPatt {

    public static void hollowrect(int m,int n){

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 ||i==m || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
               
        }
         System.out.println();
            }
    }

    public static void main(String []args){



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows & cols: ");
        int m=sc.nextInt();
        int n=sc.nextInt();


        hollowrect(m,n);
    }

    
}
