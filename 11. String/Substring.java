public class Substring {

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i =si; i<ei; i++){
            substr = substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        str.substring(0, 5); //Inbuilt Function
        System.out.println(substring(str, 0, 5));
    }
}
