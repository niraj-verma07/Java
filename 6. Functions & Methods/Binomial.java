public class Binomial {


    public static int fact(int n){
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact *= i;
        }
        return fact;


    }


    public static int binoCoffe(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
    public static void main(String[] args) {
        System.out.println(binoCoffe(5, 2));
    }
}
 