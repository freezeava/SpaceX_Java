import java.util.Scanner;

public class CircleArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pi=3.14f;
        System.out.println("Enter the radius of circle:");
        int rad=sc.nextInt();

        float area=pi*rad*rad;
        System.out.println("Area of Circle is: "+area);

    }
    
}
