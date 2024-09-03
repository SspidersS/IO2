public class Main {
    public static void main(String[] args) {
        String inputFilePath = "./file.txt";
        String outputFilePath = "./user.json";
        UserConverter.convertFileToJson(inputFilePath, outputFilePath);
    }
}
