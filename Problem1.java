/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

/**
 *
 * @author nouf
 */
public class Problem1 {

    public static void main(String args[]) {
        Multiplay3();
        Multiplay5();

        int x = (Multiplay3() + Multiplay5())- getCommonFactorSum();
        System.out.println("The sum of multiplay 3 & 5 are : " + x);
    }
//getting multiply 3

    public static int Multiplay3() {

        int product;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            product = i * 3;
            if (product < 1000) {

                sum = product + sum;

            } 
        }

        return sum;
    }
//getting multiply 5
    public static int Multiplay5() {

        int product ;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            product = i * 5;

            if (product < 1000) {

                sum = product + sum;

            }
        }

        return sum;
    }
//getting common factors
    private static int getCommonFactorSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
}
