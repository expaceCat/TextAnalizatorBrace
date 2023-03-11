public class Main {
    public static void main(String[] args) {


        String badVariant = "{Привет. (Тут {скобки не} закрыты.}";
        String goodVariant = "({Привет},(тут скобки закрыты), ([no tyt ])  is open)";
        TextValidatorBraces textValidatorBraces = new TextValidatorBraces();
        System.out.println(textValidatorBraces.checkTextOnBraceValid(goodVariant));


    }
}
