public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
