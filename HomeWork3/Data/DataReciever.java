package HomeWork3.Data;

import java.util.Scanner;

public class DataReciever {
    public static String newData() {
        System.out.println("Введите данные в формате: Иванов Иван Иванович 1.01.2001 89123456789 м");
        Scanner sc = new Scanner(System.in);
        
        return sc.nextLine().trim();
    }
}
