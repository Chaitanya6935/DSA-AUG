public class PerfectNumber {
    public static void main(String []args){
        int num = 28,count=0;
        for(int i = 1;i<=num/2;i++){
            if(num%i==0){
                count += i;
            }
        }
        if(count == num){
            System.out.println("it is perfect number ");
        }
        else {
            System.out.println("it is not perfect number");
        }
    }
}
