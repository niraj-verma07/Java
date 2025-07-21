public class EvenOdd {

    public static boolean evenOdd(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(evenOdd(11));
    }
}
