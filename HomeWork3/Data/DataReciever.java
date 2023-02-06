package HomeWork3.Data;

import java.util.Scanner;

public class DataReciever {
    public static String newData() {
        System.out.println("Введите данные в формате: Ivanov Ivan Ivanovich dd.mm.yyy 89007776655 m");
        Scanner sc = new Scanner(System.in);
        // String data = sc.nextLine().trim();
        // sc.close();
        // return data;
        return sc.nextLine().trim();
    }
}
