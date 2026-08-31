public class FastExponentation {
    public static void main(String [] args){
        int num = 2,power = 10,ans=1;
        while(power!=0){
            if(power%2==0){
                num = num*num;
                power/=2;
            }
            else{
                ans = ans*num;
                power-=1;
            }


        }
        System.out.println(ans);
    }
}
