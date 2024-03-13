import java.util.Scanner;

public class ExamResults {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
   
        String line1 = scanner.nextLine();
        String [] subjects = line1.split("  ");

        String line2 = scanner.nextLine();
        String [] marksStrings = line2.split("  ");

        int [] marks = new int[marksStrings.length];

        for (int i = 0; i < marksStrings.length; i++ ){
            marks[i] = Integer.valueOf(marksStrings[i]);
        }

        char [] grades = new char[marksStrings.length];

        for (int i = 0; i < marksStrings.length; i++){   
            int mark = marks[i];
            
            if (mark >= 75) {
                System.out.println(subjects[i] + " A");
            } else if (mark >= 65){
                System.out.println(subjects[i] + " B");
            } else if (mark >= 55){
                System.out.println(subjects[i] + " C");
            } else if (mark >= 35){
                System.out.println(subjects[i] + " S");
            } else if (mark >= 0){
                System.out.println(subjects[i] + " F");
            }
        }
    }
}
