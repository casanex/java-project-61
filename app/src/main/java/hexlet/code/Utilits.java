package hexlet.code;

public class Utilits {

    public static int getRandom(int min, int max) {

        return (int) (Math.random() * ((max - min) + 1) + min);
    }

}
