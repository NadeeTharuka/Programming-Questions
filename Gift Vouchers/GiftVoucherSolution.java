import java.util.Scanner;

public class GiftVoucherSolution {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int voucherCount = 0;

        while (true) {
            // input prices
            String x = scanner.nextLine();

            if (x.equalsIgnoreCase("e")) {
                break;
            } else {
                if (0 < Integer.valueOf(x) && Integer.valueOf(x) < 100000 ) {
                    // voucher count
                    voucherCount = voucherCount + Integer.valueOf(x) / 1000; 
                    // calculate total
                    total = total + Integer.valueOf(x);
                }
            }
        }

        // print results
        if (voucherCount > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(total);
        System.out.println(voucherCount);
    }
}
