public class ArrayAsArgs {

    public static void Arr(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {91,82,73};
        Arr(marks);

        // Print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println("Marks : " + marks[i]);
        }
    }
}
