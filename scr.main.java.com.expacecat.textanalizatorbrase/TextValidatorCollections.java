
import java.util.*;

public class TextValidatorCollections {

    private Map<Character, Character> getModelBrace() {
        Map<Character, Character> braces = new TreeMap<>();
        braces.put('}', '{');
        braces.put(')', '(');
        braces.put(']', '[');
        return braces;
    }


    public boolean checkTextOnBraceValid(String str) {
        Deque<Character> braces = new LinkedList<>();
        for(Character brace : str.toCharArray()) {
            if(getModelBrace().containsValue(brace)) {
                braces.push(brace);
            } else if (getModelBrace().containsKey(brace)) {
                if (braces.isEmpty() || braces.pop() != getModelBrace().get(brace)) {
                    return false;
                }
            }
        }
        return braces.isEmpty();
    }

}
