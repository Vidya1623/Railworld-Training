//2.Generate electricity
0-100 units=2 per unit			50 unit =100
101-150=3 per unit	110 unit = 200 + (10*3)30 =230
151-200=4 per unit
201-250=5 per unit
251-300=6 per unit
301-500 = 7 per unit
501 and above=8 per unit
According to the rate list above generate electricity bill for custumer


import java.util.*;
 
class ComputeElectricityBill {
 
    // Function to calculate the
    // electricity bill
    public static int calculateBill(int units)
    {
 
        // Condition to find the charges
        // bar in which the units consumed
        // is fall
        if (units <= 100) {
            return units * 10;
        }
        else if (units <= 200) {
            return (100 * 10)
                + (units - 100)
                      * 15;
        }
        else if (units <= 300) {
            return (100 * 10)
                + (100 * 15)
                + (units - 200)
                      * 20;
        }
        else if (units > 300) {
            return (100 * 10)
                + (100 * 15)
                + (100 * 20)
                + (units - 300)
                      * 25;
        }
        return 0;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int units = 250;
 
        System.out.println(
            calculateBill(units));
    }
}

