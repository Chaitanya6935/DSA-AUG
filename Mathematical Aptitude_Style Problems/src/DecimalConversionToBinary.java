public class DecimalConversionToBinary {
    public static void main(String []args){
        int num = 123;
        String reverce = "";
        System.out.println("Decimal conversion is : ");
        while(num!=0){
            int num1 = num%2;
            reverce +=num1;
            num/=2;
        }
        String reverse = new StringBuilder(reverce).reverse().toString();
        System.out.println(reverse);
    }
}
