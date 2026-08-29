public class PalindromNumber {
    public static void main(String [] args){
        int num=121,num1=num,reverce=0;
        while(num!=0){
            int degit=num%10;
            reverce = reverce*10+degit;
            num = num/10;
        }
        if(reverce==num1){
            System.out.println("it is palindrom");
        }
        else {
            System.out.println("it is not palindrom");
        }
    }
}
