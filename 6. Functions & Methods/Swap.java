public class Swap {

    public static void swap(int a, int b){
        //Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

    public static void main(String[] args) {
        int a =10;
        int b =20;
        swap(a,b);
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
