
public class Main {
    public static void main(String[] args) {

        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }

    public static int smallest(int[] array) {
        int min=array[0] ;
        for (int each : array) {
            if (each < min)
                min = each;
        }
        return min;
    }

    public static int indexOfTheSmallest (int [] array ) {
        int min = smallest (array);
        for (int i = 0 ; i<array.length ; i++ ) {
            if (array[i]== min)
                return i;
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int minIndex = index;
        for (int i = index ; i<array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp =array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        for (int i=0 ; i<array.length ; i++ ) {
            swap ( array , i , indexOfTheSmallestStartingFrom (array,i));

        }
    }

}


