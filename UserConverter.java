import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static void convertFileToJson(String inputFilePath, String outputFilePath) {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            br.readLine(); // Пропускаємо заголовок

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                users.add(new User(name, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write("[\n");
            for (int i = 0; i < users.size(); i++) {
                writer.write(users.get(i).toJson());
                if (i < users.size() - 1) {
                    writer.write(",\n");
                }
            }
            writer.write("\n]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
