public class Main {
    public static void main(String[] args) {

        TextAnalizator textAnalizator = new TextAnalizator();
        String badVariant = "{Привет. Тут скобки не закрыты.)}";
        String goodVariant = "({Привет,тут скобки закрыты})";
        textAnalizator.checkBrace(badVariant);
        textAnalizator.checkBrace(goodVariant);
    }
}
