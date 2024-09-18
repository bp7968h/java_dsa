package data_structures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] price_of_pen = new int[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i<price_of_pen.length; i++) {
            price_of_pen[i] = input.nextInt();
        }
        
        input.close();

        for (int i=0; i<price_of_pen.length; i++) {
            System.out.print(price_of_pen[i] + " ");
        }
    }
}