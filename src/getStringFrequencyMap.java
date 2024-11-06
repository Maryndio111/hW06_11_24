import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getStringFrequencyMap {
    public static Map<String,Boolean>stringBooleanMap(List<String>strings){
        if (strings==null){
            return new HashMap<>();
        }
        Map<String,Integer>frequencyMap = new HashMap<>();
        for (String str :strings){
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);

        }
        Map<String, Boolean>result = new HashMap<>();
        for (Map.Entry<String,Integer> entry: frequencyMap.entrySet()){
           return result;
        }


    }
}

