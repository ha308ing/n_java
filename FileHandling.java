import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String filepath = "filename.txt";
        new CreateFile(filepath);
        new WriteToFile(filepath);
        new ReadFile(filepath);
        new GetFileInfo(filepath);
        new DeleteFile(filepath);
    }

    static class CreateFile {
        CreateFile(String filePath) {
            try {
                File file = new File(filePath);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    static class WriteToFile {
        WriteToFile(String filePath) {
            try {
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write("Hello!");
                fileWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    static class ReadFile {
        ReadFile(String filePath) {
            try {
                File file = new File(filePath);
                Scanner fileReader = new Scanner(file);
                while (fileReader.hasNextLine()) {
                    String string = fileReader.nextLine();
                    System.out.println(string);
                }
                fileReader.close();
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    static class GetFileInfo {
        GetFileInfo(String filePath) {
            try {
                File file = new File(filePath);

                if (file.exists()) {
                    System.out.println("File name: " + file.getName());
                    System.out.println("File absolute path: " + file.getAbsolutePath());
                    System.out.println("File is writable: " + file.canWrite());
                    System.out.println("File is readable: " + file.canRead());
                    System.out.println("File size in bytes: " + file.length());
                } else {
                    System.out.println("The file does not exist.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    static class DeleteFile {
        DeleteFile(String filePath) {
            File file = new File(filePath);

            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}
