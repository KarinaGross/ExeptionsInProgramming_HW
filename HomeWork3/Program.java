package HomeWork3;

import java.util.Scanner;

import HomeWork3.Data.DataHandler;




public class Program {
    public static void main(String[] args) {
        while (true) {
            String s = start();
            if (s.equals("new")) {
                FileSaver.save(DataHandler.newData());
            } else if (s.equals("exit")) {
                return;
            } else {
                System.out.println("Введите корректную команду\n");
            }
        }
    }

    static String start() {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Новая запись - new
                Выход - exit
                """);

        return input.nextLine();
    }
}


