import java.util.Scanner;

public class AssessmentTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        int percentage = Integer.valueOf(inputString.replace("%", ""));

        double result = 200000 / percentage;
        System.out.println(result);

        scanner.close();
    }
}
