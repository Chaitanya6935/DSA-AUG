public class NumberDigitSum {
    public static void main(String[]args){
        int num = 1234,sum=0,degit;

        while(num!=0){
            degit = num%10;
            sum+=degit;
            num/=10;
        }
        System.out.println("Total sum is : "+sum);

    }
}
