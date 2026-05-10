import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class DataGenerator {
    public static final Random num= new Random(50);
    private static void Generator(int count, String filename) throws IOException {
        int maxNum = 10000;
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))){
            writer.println(count);

            for (int i = 0; i < count; i++){
                writer.println(num.nextInt(maxNum));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void runGenerator() throws IOException {
        int[] sizes = {
                100, 200, 300, 400, 500,
                600, 700, 800, 900, 1000,
                1500, 2000, 2500, 3000, 3500,
                4000, 4500, 5000, 6000, 7000,
                8000, 9000, 10000
        };

        for (int size : sizes){
            String filename = "Data" + size;
            Generator(size, filename);
        }
    }
}
