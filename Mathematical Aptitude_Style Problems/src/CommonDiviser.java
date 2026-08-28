import java.util.Scanner;
public class CommonDiviser {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println(" common factor numbers : ");
        System.out.println("Enter first number ");
        int num1 = s.nextInt();
        System.out.println("Enter Second number ");
        int num2 = s.nextInt();
        if(num1>num2){
            System.out.println("Common factors : ");
            for(int i=1;i<=num1;i++){
                if(num1%i==0 && num2%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.println("Common factors : ");
            for(int i=1;i<=num2;i++){
                if(num1%i==0 && num2%i==0){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
