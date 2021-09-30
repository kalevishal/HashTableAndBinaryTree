import java.util.HashMap;
import  java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        String str = "To be or not to be";

        String [] strArray = str.split(" ");
         Map<String,Integer> map = new HashMap<String,Integer>();

        for (String word : strArray){
            Integer number = map.get(word);
            if (number == null){
                number = 1;
            }
            else {
                number++;
            }
            map.put(word,number);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  "+ entry.getValue());
        }
    }
}