package HomeWork3;

public class InputException extends Exception {
    public InputException() {

        System.out.println("Количество полей неверно! Введите данные в формате: Иванов Иван Иванович 1.01.2001 89123456789 м");
    }
}