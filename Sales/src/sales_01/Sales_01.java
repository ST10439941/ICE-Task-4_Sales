package sales_01;

import java.util.Scanner;

/**
 *
 * @author shane
 */
public class Sales_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //6) Allows user to input how many salespeople they would like to add
        System.out.println("Enter how many salespeople you would like to add: ");
        int SALESPEOPLE = scan.nextInt();
        
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int average;
        int minimum;
        int maximum;
        int minIndex = 0;
        int maxIndex = 0;
        int salesEx;
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("-------------------");
        sum = 0;
        minimum = sales[0];
        maximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if ( sales[i] > maximum){
                maximum = sales[i];
                maxIndex = i;
            }
            if(sales[i] < minimum){
                minimum = sales[i];
                minIndex = i;
            }
        }
        
        System.out.println("\nTotal sales: " + sum);

        //1) average
        System.out.println("\nSales Average");
        System.out.println("---------------");
        average = sum / SALESPEOPLE;
        System.out.println("Total average: " + average);
        
        System.out.println("\nMax and Min Sale");
        System.out.println("------------------");
        //2) Maximum
        System.out.println("Salesperson " + (maxIndex + 1) + " had the highest sale with $ " + maximum);
        //3) Minimum
        System.out.println("Salesperson " + (minIndex + 1) + " had the lowest sale with $ " + minimum);
        
        //4) Amount exceeded
        System.out.println("\nSales Target");
        System.out.println("--------------");
        System.out.println("What was the sales target: ");
        salesEx = scan.nextInt();
        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= salesEx){
                System.out.println("Salesperson "+ (i + 1) +" hit the target sales of $" + sales[i] );
            }
        }
        
        //5) To make the salesperson increment from 1 I made ( i + 1 ) and (maxIndex + 1) which
                    //begins the increment from 1 and not 0.
                    
        
            
    }
}
