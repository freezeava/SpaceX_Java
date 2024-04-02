import java.util.Scanner;

public class ProdFun {


    public static int prod(int a,int b){

        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos a & b : ");

        int a=sc.nextInt();
        int b=sc.nextInt();

        
        System.out.println("product is: "+prod(a,b));
    }
    
}
