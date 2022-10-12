package chapter7;

public class Exercise_7_16_ExecutionTime {
    public static void main(String[] args) {
        int key = (int) (Math.random() * Integer.MAX_VALUE);
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        long startTime = System.nanoTime();
        int index = linearSearch(numbers, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Linear Search (" + index + ")       =" + executionTime);
        System.out.println(index);


        startTime = System.nanoTime();
        index = binarySearch(numbers, key);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;

        System.out.println("Binary Search (" + index + ")   =" + executionTime);


    }

    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high =numbers.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if (key>numbers[mid]){
                low = mid + 1;
            } else if (key == numbers[mid]) {
                return mid;
            }else
                high = mid -1;
        }
        return -low-1;
    }

    public static int linearSearch(int[] numbers, int key) {
        for (int i = numbers.length-1 ; i >=0 ; i--) {
            if (key == numbers[i]) {
                return i;

            }
        }

        return -1;
    }
}
