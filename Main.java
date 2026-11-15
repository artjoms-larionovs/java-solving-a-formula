import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //formula: (x+1)^2 / (x-1)^(1/2)
    public static void main(String[] args) {
        double x, dx, xg;
        Scanner sc = new Scanner(System.in);
        try {
            //original x number
            System.out.println("from: ");
            x = sc.nextDouble();
            //last x number
            System.out.println("to: ");
            xg = sc.nextDouble();
            //by how much to increase the number x
            System.out.println("step: ");
            dx = sc.nextDouble();

            // will end, when x will be equal to or less than xg+dx/2
            while (x <= xg+dx/2) {
                //if x less than 1
                if (x < 1)
                    System.out.printf("%.2f\tnot defined%n",x);
                //solve the formula
                else {
                    System.out.printf("%.2f\t%.2f", x, (Math.pow(x + 1, 2) / Math.sqrt(x - 1)));
                    System.out.println(" ");
                }
                //increase x 
                x = x + dx;
            }
        // output if in input isn't a number
        } catch (Exception e) {
            System.out.println("input-output error");
        }

        sc.close();
    }
}
