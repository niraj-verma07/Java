public class HollowRectangle{

    public static void hollowRec(int totRows, int totCols){
        //Outer loop
        for(int i = 1 ; i <= totRows; i++){
            //Inner Loop
            for(int j =1; j<=totCols; j++){
                if(i==1 || i== totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        hollowRec(4, 5);
    }
}