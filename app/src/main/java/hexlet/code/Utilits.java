package hexlet.code;

public class Utilits {
final static int HUNDRED = 100;
    public static int getRandom() {         // возвращает случайное число в диапазоне до 100
        return (int) (Math.random()* HUNDRED);
    }
    public static String  getRandomOperation() {
        String[] operations = {"+", "-", "*"};
        int a = (int) (Math.random() * operations.length);
        return operations[a];
    }
}
