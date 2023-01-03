import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) throws Exception {
        int data[] = new int[10];
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            data[i] = rand.nextInt(100);
        }

        int[] orig = Arrays.copyOf(data, data.length);

        System.out.println("Arrays equal before sort: " + Arrays.equals(data,orig));
        Arrays.sort(data);
        System.out.println("Arrays equal after sort: " + Arrays.equals(data,orig));
        System.out.println("Orig: " + Arrays.toString(orig));
        System.out.println("Data: " + Arrays.toString(data));

    }
}
