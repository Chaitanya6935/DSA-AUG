public class PrimeNumber {
    public static void main(String []args){
        int num = 30,count=0;
        System.out.print("All Perfect numbers 1 to "+num+" : ");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
            count=0;
        }
    }
}
