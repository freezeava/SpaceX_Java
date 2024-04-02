import java.util.Scanner;

public class ReverseOfANumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print the reverse of: ");


        int n=sc.nextInt(); //n=10899

        while(n>0){
            int rev=n%10;
            System.out.print(rev);
            n=n/10;
        }

    }
    
}
