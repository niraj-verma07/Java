public class GreaterOf3 {

    public static void great(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a + " is greater than " + b + " and "+ c);
        }else if(b > c && b>a){
            System.out.println(b + " is greater than " + a + " and "+ c);
        }else{
            System.out.println(c + " is greater than " + a + " and "+ b);
        }
    }
    public static void main(String[] args) {
        great(1000, 200, 30);
    }
}
