import java.util.*;

public class ContinueQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Number : ");
            int number = sc.nextInt();

            if(number%10 == 0){
                continue ;
            }

            System.out.println(number);
        }while(true);
    }
}
