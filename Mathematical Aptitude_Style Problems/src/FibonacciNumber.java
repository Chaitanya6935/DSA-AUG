import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter n th fibonacci number : ");
        int num = s1.nextInt();
        int num1=1,fib=0,ans = 0;
        for(int i=1;i<num;i++){

            fib = num1+ans;
            ans = num1;
            num1 = fib;

        }
        System.out.println(num +" th fibonacci number is "+ ans);

    }
}
