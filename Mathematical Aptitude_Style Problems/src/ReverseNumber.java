public class ReverseNumber {
    public static void main(String []args){
        int num=12345,reverce=0,digit=0;
        while(num!=0){
            digit = num%10;
            reverce = reverce*10+digit;
            num = num/10;
        }
        System.out.println(reverce);
    }

}
