import java.util.HashMap;


public class Translator {

    static HashMap<Integer,String> numericAlpha = new HashMap<>();

        public Translator (String[] alphabetic, Integer[] numeric){

        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }


    public static String translate (Integer number){
           String value = numericAlpha.get(number);
            return value;
    }

    }


