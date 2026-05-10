import java.io.IOException;

public class Main {
    public static void main(String[] args){
        DataGenerator gen = new DataGenerator();
        try {
            gen.runGenerator();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
