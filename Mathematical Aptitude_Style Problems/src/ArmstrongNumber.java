public class ArmstrongNumber {

    public static void main(String []args){
        String num1 = "153";
        int count=0,num3;
         String[] num2= num1.split("" +
                 "");
        for(int i=0;i<num2.length;i++){
             num3 = Integer.parseInt(num2[i]);
             count = count+(num3*num3*num3);
        }
        if(Integer.parseInt(num1)==count){
            System.out.println("it is arm Strong ");
        }
        else {
            System.out.println("it is not"+count);
        }
    }
}
