import java.util.Arrays;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("apple","banan","grape","orange","apple","baban");
        Map<String,Boolean>result =  getStringFrequencyMap(strings);
        System.out.println(result);

    }
}