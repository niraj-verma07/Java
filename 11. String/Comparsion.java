public class Comparsion {
    
    public static void main(String[] args) {
        String s1 = "Niraj";
        String s2 = "Niraj";
        String s3 = new String("Niraj");

        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strinf are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
             System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        
    }
}
