
import java.util.ArrayList;
import java.util.Scanner;
public class LCM {
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=s1.nextInt();
        System.out.println("Enter Second number ");
        int num2 = s1.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int i =1;i<=10;i++){
            a1.add(num1*i);
        }
        for(int i =1;i<=10;i++){
            a2.add(num2*i);
        }
        a1.retainAll(a2);
        for(Integer num :a1){

            System.out.println("LCM : "+num);
            break;


        }
    }
}
