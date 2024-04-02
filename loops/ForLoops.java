public class ForLoops {
    public static void main(String []args){

        int n=10;

        for(int i=1;i<=n;i++){
            if(i==6){
                continue; //break
            }
            System.out.print(i*10+" ");
        }
    }
    
}
