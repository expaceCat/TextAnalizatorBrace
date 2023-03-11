
import java.util.*;

public class TextValidatorBraces {

    private Map<Character, Character> getModelBrace() {
        Map<Character, Character> braces = new TreeMap<>();
        braces.put('}', '{');
        braces.put(')', '(');
        braces.put(']', '[');
        return braces;
    }


    public boolean checkTextOnBraceValid(String str) {
        Deque<Character> characters = new LinkedList<>();
        for(Character character : str.toCharArray()) {
            if(getModelBrace().containsValue(character)) {
                characters.push(character);
            } else if (getModelBrace().containsKey(character)) {
                if (characters.isEmpty() || characters.pop() != getModelBrace().get(character)) {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

}
