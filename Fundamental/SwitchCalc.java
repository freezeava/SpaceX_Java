import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operator");
        char ope=sc.next().charAt(0);

        System.out.println("Enter two nos a & b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        switch(ope){

            case '+':System.out.println("Sum is "+(a+b));
                     break;
            case '-':System.out.println("Diff is: "+(a-b));
                     break;
            case '*':System.out.println("Product is "+(a*b));
                     break;
           case '/':System.out.println("Quotient is "+(a/b));
                    break;
           case '%':System.out.println("Remainder is "+(a%b));
                    break;
        }



    }
    
}
