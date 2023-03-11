public class TextValidatorArrays {

    private final char[] itemsFormat = {'{', '}', '(', ')', '[', ']'};

    public boolean checkTextOnBraceValid(String str) {
        char[] bufferOfBrackets = getBracketsArray(str); //получаем готовый по размеру массив со скобками по порядку
        char[] openBrackets = new char[bufferOfBrackets.length/2]; // создаем массив для открывающих скобок, будет работать как стек.
        int count = 0;  // создаем переменную она будет работать как индекс текущего стека массива.
        if(bufferOfBrackets.length % 2 != 0) return false;  //если длина не четная, значит false

        for (char bufferOfBracket : bufferOfBrackets) { // задаем цикл для проверки строки скобок.
            for (int j = 1; j < itemsFormat.length; j += 2) { // создаем цикл для проверки items со строкой

                if (itemsFormat[j - 1] == bufferOfBracket) { // если открывающая скобка равна скобке в строке
                    openBrackets[count] = bufferOfBracket; // добавляем ее в стек
                    count++; // увеличиваем для следующей ячейки
                } else if (itemsFormat[j] == bufferOfBracket) { // если закрывающая скобка
                    if (openBrackets[count - 1] == itemsFormat[j - 1]) { // проверяем, равна ли она последней положенной открытой
                        openBrackets[count - 1] = ' '; // если равна, то делаем ячейку пустой
                        count--; // откатываем ячейку назад
                    }
                }
            }
        }
        return count == 0; // если все скобки совпадут, то должен остаться 0, в другом случае комбинация скобок неверна
    }

    public char[] getBracketsArray(String str) { // получаем ровный массив скобок в правильном порядке
        int itemCount = 0;
        char[] brackets = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            for (char item : itemsFormat) {
                if (str.charAt(i) == item) {
                    brackets[itemCount] = str.charAt(i);
                    itemCount++;
                }
            }
        }
        char[] result = new char[itemCount];
        System.arraycopy(brackets, 0, result, 0, itemCount);
        return result;
    }
}
