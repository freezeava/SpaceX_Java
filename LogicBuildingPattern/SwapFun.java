import java.util.Scanner;

public class SwapFun {

    public static void swapFun(int a,int b){
        int temp=0;

        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping value of a: "+ a+" & b: "+b );

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos a & b:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        swapFun(a,b);
       System.out.println("Before Swapping value of a: "+ a+" & b: "+b );




    }
    
}
