// using 2D Arrays. 

public class Prices {

    public static void main(String[] args) {

        //task 1 - create a 2D Array that can store 3 rows and 5 columns of double values.

        //task 2 - populate your 2D array with values from the table
        double[][] prices =  {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        //Task 3 - Print the prices for each department. Prices should share a single line 
        for (int i = 0; i < prices.length; i++){

        switch(i){
            case 0: System.out.print("\tBaking: "); break;
            case 1: System.out.print("\tBeverage: "); break;
            case 2: System.out.print("\tCereal: "); break;

    }
    for (int j = 0; j < prices[i].length; j ++){
    System.out.print(prices[i][j] + " ");
    }
    System.out.print("\n");
}
}
}