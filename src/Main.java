import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int initial = 0;
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numberList.add(i);
           initial = initial + i;
        }

        System.out.println(initial);
        System.out.println(numberList);

        Random rand = new Random();
        numberList.remove(rand.nextInt(numberList.size()));
        int sum = 0;
        for (int i = 1; i < numberList.size(); i++) {
            sum = sum + numberList.get(i);
        }
        System.out.println(sum);
        System.out.printf("The missing number is: %d%n", initial - sum);
    }
}