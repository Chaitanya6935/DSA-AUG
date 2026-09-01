import java.util.Scanner;
public class RatioProportion {
    public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter value a ");
        int a = s1.nextInt();
        System.out.println("Enter value b ");
        int b = s1.nextInt();
        System.out.println("Enter value c ");
        int c = s1.nextInt();

        System.out.println("ratio is : "+a+" : "+b);
        int d = (b*c)/a;
        System.out.println("proportion is  "+a+" : "+b+" = "+c+" : "+d);
    }

}
