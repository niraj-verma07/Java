public class Diamond {

    public static void diamond(int n){
        //outter 1st half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}
