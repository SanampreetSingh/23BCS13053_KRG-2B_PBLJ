import java.util.ArrayList;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish)");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer or 'done' to finish.");
            }
        }

        try {
            int sum = 0;
            for (int num : numbers) sum += num;
            double avg = (double) sum / numbers.size();
            System.out.println("Numbers: " + numbers);
            System.out.println("Average: " + avg);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot calculate average. The list is empty!");
        }
        sc.close();
    }
}
