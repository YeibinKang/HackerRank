import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
        
        //get Anna paid price
            //calculate total price
            //exclude a price which is only Brian eating
            //divide into 2 for getting a split price
        
        //compare b and Anna paid price
            //if same, print Bon Appetit
            //else, print charged(b) - Anna paid price
        
        int totalBill = 0;
        
        //get a total price
        for(int i = 0; i<bill.size(); i++){
            totalBill += bill.get(i);
        }
        
        //exclude the price for only Brian
        totalBill = totalBill - bill.get(k);
        
        //calculate the price for food which is having together
        totalBill = (totalBill/2);    //calculate split bill 
        
        if(totalBill == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - totalBill);
        }
        
        
        


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
