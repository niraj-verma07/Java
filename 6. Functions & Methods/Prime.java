
public class Prime {

//    public static boolean isPrime(int n){
//     // boolean isPrime = true;
//      if(n == 2){
//         return true;
//      }  // If the number is 2 the below code will not run

//     for(int i = 2; i <=n-1; i++){
//         if(n%i == 0){
//             // isPrime = false;
//             // break;

//             return false;
//         }
//     }
//     return true;
//    } 

//Optimized Function

public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        System.out.println(isPrime(12)); // return true if prime else fal
    }
}
