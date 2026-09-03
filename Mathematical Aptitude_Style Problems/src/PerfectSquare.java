import java.util.Scanner;

public class PerfectSquare {
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any square : ");
        int square = s1.nextInt();
        int num=0;
        while(num!=square){
            if(num*num==square){
                System.out.println(square+" it is perfect square ");
                break;
            }
            num+=1;
            if(num==square){
                System.out.println(square+" it is not perfect square");
            }
        }
    }
}
