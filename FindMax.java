public class FindMax { 
    public static int findMax(int[] arr) { 
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) { 
                max = arr[i]; 
            }
        } 
        return max; 
    } 

    public static void main(String[] args) { 
        int[] numbers = {15, 42, 8, 99, 27, 64}; 
        int maxVal = findMax(numbers); 
        System.out.println("Maximum element in the array: " + maxVal); 
    }
}
