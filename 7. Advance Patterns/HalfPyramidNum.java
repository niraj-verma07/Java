public class HalfPyramidNum {

    public static void halfPyramidNum(int n){
        //outer
        for(int i=1; i<=n; i++){
            //inner (number)
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j); // j beacuse it has number value
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramidNum(5);
    }
}
