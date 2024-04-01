import java.util.Scanner;

public class LargestOfTwo{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos a & b :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>=b){
            System.out.println("A is Largest");
        }else{
            System.out.println("B is Largest");
        }


    }
}