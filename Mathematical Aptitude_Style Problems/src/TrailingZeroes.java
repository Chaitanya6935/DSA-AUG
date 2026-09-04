public class TrailingZeroes {
    public static void main(String []args){
        int num = 1000,count=0,result=0;
        while(num>=5){
            num = num/5;
            result +=num;

        }

        System.out.println("traling zeroes is :"+result);
    }
}
