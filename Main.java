import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //formula: (x+1)^2 / (x-1)^(1/2)
    public static void main(String[] args) {
        double x, dx, xg;
        Scanner sc = new Scanner(System.in);
        try {
            //sākotnējais x skaitlis
            System.out.println("from: ");
            x = sc.nextDouble();
            //pēdējais x skaitlis
            System.out.println("to: ");
            xg = sc.nextDouble();
            //uz cik pievienot x skaitli
            System.out.println("step: ");
            dx = sc.nextDouble();

            // beigsies lidz x bus vienads vai mazaks par xg+dx/2
            while (x <= xg+dx/2) {
                //ja x ir mazaks par 1
                if (x < 1)
                    System.out.printf("%.2f\tnot defined%n",x);
                //aprekina formulu
                else {
                    System.out.printf("%.2f\t%.2f", x, (Math.pow(x + 1, 2) / Math.sqrt(x - 1)));
                    System.out.println(" ");
                }
                //palielina skaitli uz dx
                x = x + dx;
            }
        // izvada, ja izvada kaut kadu citu simbolu, bet ne skaitli
        } catch (Exception e) {
            System.out.println("input-output error");
        }

        sc.close();
    }
}
