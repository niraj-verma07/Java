//Swap two numbers without using third variable.
public class SwapNum {
    public static void main(String[] args) {
        int x =10;
        int y = 20;

        //Swap using XOR

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap : x = " + x + " and y = " + y);
    }
}

//What is the value of X^X for any value of X?
// The value of X^X = 0, because when we calculate Xor of X we will find the 0 in binary because the same binary form return 0 and in the same value of X the bimary will be also same

