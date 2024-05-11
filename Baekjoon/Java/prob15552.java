import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            writer.write(String.valueOf(a + b));
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }
}
