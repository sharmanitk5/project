import java.util.HashMap;
import java.util.Map;

public class Leet {
    public static void main(String[] args) {
        String s = "MDCLXVI";
        Map<Character, Integer> m = new HashMap();
        m.put('M', 1000);
        m.put('D', 500);
        m.put('C', 100);
        m.put('L', 50);
        m.put('X', 10);
        m.put('V', 5);
        m.put('I', 1);


        for (int i = 0; i < s.length()-1; i++) {
            int sum =0;
            char charval = s.charAt(i);
            int value = m.get(charval);
            if(m.get(s.charAt(i+1))>m.get(s.charAt(i))){
                 int result = m.get(s.charAt(i+1))-(m.get(s.charAt(i)));

                System.out.println(result);



            }
else{
                int result = m.get(s.charAt(i+1))+(m.get(s.charAt(i)));
                System.out.println(result);
            }

        }


    }

}