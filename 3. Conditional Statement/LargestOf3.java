public class LargestOf3 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 30;
        int num3 = 18;

        if((num1 > num2)&&(num1 > num3)){
            System.out.println(num1 + " is greater than " + num2 + " and " + num3 );
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println(num2 + " is greater than " + num1 + " and " + num3 );
        }else{
            System.out.println(num3 + " is greater than " + num1 + " and " + num2 );
        }
    }
}
