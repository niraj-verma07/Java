public class FloydTriangle {
    
    public static void floydTri(int n){
        int counter = 1;
        //outer
        for(int i=1; i<=n; i++){
            //inner
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTri(5);
    }
}
