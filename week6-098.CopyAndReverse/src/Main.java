

public class Main {

    public static void main(String[] args) {
        // write testcode here

    }
    public static int[] copy(int[] array) {
        int [] liste = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            liste[i] = array[i];
        }
        return liste;
    }

    public static int[] reverseCopy(int[] array) {
        int[] liste = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            liste[i] = array[array.length-i-1];
        }
        return liste;
    }
}
