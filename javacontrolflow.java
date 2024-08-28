import java.util.*;

public class javacontrolflow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");

           
            switch (num) {
                case 1:
                    System.out.println("SUNDAY");
                    break;
                case 2:
                    System.out.println("MONDAY");
                    break;
                case 3:
                    System.out.println("TUESDAY");
                    break;
                case 4:
                    System.out.println("WEDNESDAY");
                    break;
                case 5:
                    System.out.println("THURSDAY");
                    break;
                case 6:
                    System.out.println("FRIDAY");
                    break;
                case 7:
                    System.out.println("SATURDAY");
                    break;
                default:
                    System.out.println("No week in the range");
                    break;
            }

            
            System.out.print("Numbers upto the input :");
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

           
            System.out.print("Numbers from input upto 0 :");
            for (int j = num; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

            int k = 1;
            do {
                System.out.print(k + " ");
                k++;
            } while (k <= 3);
            System.out.println();
            
            int count = 1;
            while (count <= num) {
                System.out.print(count + " ");
                count++;
            }
           
        }
    }
}