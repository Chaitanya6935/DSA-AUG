class Solution {
    public static int getSum(int num){
        int digit=0;
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num%10!=num)
        {
            num=getSum(num);

        }

        return num;

    }
}