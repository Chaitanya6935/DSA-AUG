public class Factorial {
    public static  int fact(int num){

        if(num==0){
            return 1;
        }
        else{


            return num*fact(num-1);
        }

    }

    public static void main(String[] args) {
        int num = 5;
        // for(int i = 1;i<=num;i++){
        //     fact = i*fact;
        // }
        int n = fact(num);
        System.out.println("factorial of "+num+" is : "+n);

    }
}
