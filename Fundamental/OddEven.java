import java.util.Scanner;

public class OddEven {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n :");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("EVEN number");
        }else{
            System.out.println("ODD Number");
        }

    }
}
