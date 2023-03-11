public class Main {
    public static void main(String[] args) {


        String text = "({Привет},(тут { (  ) }ск(об)[}]ки закрыты), ([no tyt ])  is open)";
        TextValidatorCollections tvb = new TextValidatorCollections();
        TextValidatorArrays tva = new TextValidatorArrays();
        System.out.println(tvb.checkTextOnBraceValid(text));
        System.out.println(tva.checkTextOnBraceValid(text));


    }
}
