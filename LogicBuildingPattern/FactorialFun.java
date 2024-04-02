import java.util.Scanner;

public class FactorialFun {

    public static void facto(int n){

        int fact=1;

        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("factorial of "+n +"  is: "+fact);


    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find factorial for: ");
        int n=sc.nextInt();

        facto(n);
    }
    
}
