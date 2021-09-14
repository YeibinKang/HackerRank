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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    
        int highest = 0;
        int lowest = 0;
        int touchLowest = 0;
        int touchHighest = 0;
        
        List<Integer> countScores = new ArrayList<Integer>();
        
        for(int i=0; i<scores.size(); i++){
            
            //check the first score
            if(i == 0){
                lowest = scores.get(i);
                highest = scores.get(i);
            }
            
            //get the lowest/highest score
            if(scores.get(i) < lowest){
                lowest = scores.get(i);
                touchLowest++;
            }else if(scores.get(i) > highest){
                highest = scores.get(i);
                touchHighest++;
            }
            
            
            
        }
        
        countScores.add(touchHighest);
        countScores.add(touchLowest);
        
        return countScores;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}