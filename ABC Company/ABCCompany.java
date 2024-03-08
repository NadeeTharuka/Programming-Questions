import java.util.Scanner;

public class ABCCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int emp1units =0;
        int emp1hours =0;
        String line1 = scanner.nextLine();
        emp1units = Integer.valueOf(line1.split(" ")[0]);
        emp1hours = Integer.valueOf(line1.split(" ")[1]);

        int emp1Productivity = emp1units/emp1hours;

        int emp2units =0;
        int emp2hours =0;
        String line2 = scanner.nextLine();
        emp2units = Integer.valueOf(line2.split(" ")[0]);
        emp2hours = Integer.valueOf(line2.split(" ")[1]);

        int emp2Productivity = emp2units/emp2hours;

        System.out.println(emp1Productivity);
        System.out.println(emp2Productivity);
    }
}
