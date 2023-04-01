package hexlet.code;

public class Utilits {
    private static final int BORDER_NUMBER = 100;

    public static int getRandom() {         // возвращает случайное число в диапазоне до 100
        return (int) (Math.random() * BORDER_NUMBER);
    }
    public static String  getRandomOperation() {
        String[] operations = {"+", "-", "*"};
        int a = (int) (Math.random() * operations.length);
        return operations[a];
    }
}
