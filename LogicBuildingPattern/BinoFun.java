import java.util.Scanner;

public class BinoFun {


    public static int fact(int n){

        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }

        return f;
    }



    public static void binoFun(int n,int r){


        //nCr=n!/r!*(n-r)

       int nfact =fact(n);
       int rfact=fact(r);
       int nMrfact=fact(n-r);


        float nCr=nfact/(rfact*nMrfact);
        System.out.println("binomial coefficient is: "+ nCr);
    }







    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and r");

        int n=sc.nextInt();
        int r=sc.nextInt();


        binoFun(n,r);


    }
    
}
