import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        
        if(num == 2){
            System.out.println("Number is prime");;
        }else{
            boolean isPrime = true;
            // for(int i =2; i<= num-1; i++){
            for(int i = 2; i<= Math.sqrt(num); i++){
                if(num % i == 0){ // Num is a multiple of i (i not eqaul to 1 or n )
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is not prime");
            }

        }
    }
}