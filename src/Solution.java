import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    double meal_cost;
    int tip_percent;
    int tax_percent;
    static final int PERCENTAGE = 100;
//    int tip;

    public void printVariables() {
        System.out.println(meal_cost);
        System.out.println(tip_percent);
        System.out.println(tax_percent);
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / PERCENTAGE;
        double tax = meal_cost * tax_percent / PERCENTAGE;
        double c = meal_cost + tip  + tax;


        System.out.println(tip);
        System.out.println(tax);
        System.out.println(Math.round(c));
    }
    
    /*
    static void calculations extends Solution(){
        tip = meal_cost * (tip_percent / 100)  ;
        tax = ;
        totalCost = ;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);


        scanner.close();
    }
}
