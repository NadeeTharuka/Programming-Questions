import java.util.Scanner;

public class GiftVoucherSolution {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
             
            // input prices
            String x = scanner.nextLine();
            if (x.equalsIgnoreCase("e")) {
                break;
            } else {
                // calculate total
                if (0 < Integer.valueOf(x) && Integer.valueOf(x) < 100000 ) {
                    total = total + Integer.valueOf(x);
                }
            }






        }
        

        System.out.println(total);

    }
}
