import java.util.Scanner;

public class SumFun {

    public static int sumFun(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos a & b: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum=sumFun(num1,num2);
        System.out.println("Sum is: "+sum);


    }
    
}
