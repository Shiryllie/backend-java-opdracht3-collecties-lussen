import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Integer,String> numericAlpha = new HashMap<>();

Translator(String[] alphabetic, Integer[] numeric) {
    for (int i = 0; i < alphabetic.length; i++) {
        numericAlpha.put(1,"een");
    }
}

 String translate(Integer number){
    return numericAlpha.get(number);
}
}
