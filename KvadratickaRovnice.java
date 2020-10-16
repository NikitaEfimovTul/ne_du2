package efimov.apps;

import java.util.Scanner;

public class KvadratickaRovnice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte a: ");
        int a = sc.nextInt();
        System.out.print("Zadejte b: ");
        int b = sc.nextInt();
        System.out.print("Zadejte c: ");
        int c = sc.nextInt();

        int d, d2, re, im, x = 0, x1, x2;

        if (a == 0){
            if (b == 0)
                System.out.println("Tohle neni rovnice");
            else
                x = -c / b;
            System.out.println("Koren je: " + x);
        }
        else{
              d = b * b - 4 * a * c;
              d2 = (int) Math.sqrt(Math.abs(d));
              if (d < 0){
                  re = -b / 2 * a;
                  im = Math.abs(d2 / (2 * a));
                  System.out.format("%d + %d", re, im);
                  System.out.format("%d - %d", re, im);
              }
              else{
                  x1 = (-b + d2) / (2 * a);
                  x2 = (-b - d2) / (2 * a);
                  System.out.print("Koren x1 je: " + x1);
                  System.out.print("Koren x2 je: " + x2);
              }
        }

    }
}
