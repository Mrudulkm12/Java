import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(10);

        int largest = numbers.get(0);

        for (int n : numbers) {
            if (n > largest) {
                largest = n;
            }
        }

        System.out.println("Largest = " + largest);
    }
}
