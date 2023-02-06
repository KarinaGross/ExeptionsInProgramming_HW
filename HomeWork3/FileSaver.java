package HomeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileSaver {  // "C:\Users\karin\OneDrive\Рабочий стол\GB\Исключения в программировании\HomeWork3"
    public static void save(Person person) {
        File file = new File(String.format("C:/Users/karin/OneDrive/Рабочий стол/GB/Исключения в программировании/HomeWork3/Persons/%s.txt", person.getLastName()));
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write(person + "\n");
            writer.flush();
            writer.close();
            System.out.println("Запись успешно добавлена!\n");
        } catch (IOException e) {
            System.out.println("Stack trace:");
            for (StackTraceElement trace : e.getStackTrace()) {
                System.out.println(trace);
            }
            System.out.println();
        }
    }
}
