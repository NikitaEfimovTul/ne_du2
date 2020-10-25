package efimov.apps;

import java.util.Scanner;

public class KvadratickaRovnice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        System.out.print("Zadejte koeficienty a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double d, d2, re, im, x = 0, x1, x2;
        if (a == 0){
            if (b == 0)
                System.out.println("Tohle neni rovnice");
            else if (b != 0){
                x = -c / b;
                System.out.println("Koren je: " + x);
            }
        }
        else{
            d = b * b - 4 * a * c;
            d2 = Math.sqrt(Math.abs(d));
            if (d < 0){
                re = -b / 2 * a;
                im = Math.abs(d2 / (2 * a));
                System.out.format("x1 = %1$.3f + %2$.3f*i \nx2 = %1$.3f - %2$.3f*i", re, im);               
            }
            else{
                x1 = (-b + d2) / (2 * a);
                x2 = (-b - d2) / (2 * a);
                System.out.format("x1 = %1$.3f\nx2 = %2$.3f", x1, x2);
            }
        }
    }
}