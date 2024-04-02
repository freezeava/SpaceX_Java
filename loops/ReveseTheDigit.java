import java.util.Scanner;

public class ReveseTheDigit {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print the reverse of: ");


        int n=sc.nextInt(); //n=10899
        int rev=0;

        while(n>0){

            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;

            

        }
        System.out.println("Reverse number is "+ rev);
    }
    
}
