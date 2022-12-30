package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
 * входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * 
 * 
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
 * не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class HomeWork_1 {

    static ErrorCodeOrResult getDifferenceArrays(Integer[] arr1, Integer[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                result.add(arr1[i] - arr2[i]);
            }
            return new ErrorCodeOrResult(false, result.toString(), "");
        } else {
            return new ErrorCodeOrResult(true, String.valueOf(Errors.DifferentArraysLength), "Длины массивов не равны");
        }
    }

    static ErrorCodeOrResult getDivArrays(Integer[] arr1, Integer[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        if (arr1.length != arr2.length) {
            return new ErrorCodeOrResult(true, String.valueOf(Errors.DifferentArraysLength), "Длины массивов не равны");
        } else if (Arrays.asList(arr2).contains(0)) {
            return new ErrorCodeOrResult(true, String.valueOf(Errors.DivisionByZero),
                    "Массив делителей содержит нули");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                result.add(arr1[i] / arr2[i]);
            }
            return new ErrorCodeOrResult(false, result.toString(), "");
        }
    }

    public static void main(String[] args) {
        Integer[] array1 = { 1, 2, 3, 4, 5, 6 };
        Integer[] array2 = { 6, 5, 4, 3, 2, 1 };
        Integer[] array3 = { 10, 10, 10 };
        Integer[] array4 = { 10, 9, 8, 0, 0, 5 };

        System.out.println(getDifferenceArrays(array1, array2));
        System.out.println(getDifferenceArrays(array1, array3));

        System.out.println(getDivArrays(array1, array2));
        System.out.println(getDivArrays(array1, array3));
        System.out.println(getDivArrays(array1, array4));
    }

}

class ErrorCodeOrResult {
    boolean flag;
    String code;
    String text;

    public ErrorCodeOrResult(boolean flag, String code, String text) {
        this.flag = flag;
        this.code = code;
        this.text = text;
    }

    private String getErrorCodeOrResult() {
        if (flag == true) {
            return String.format("ErrorCode: %s. %s", code, text);
        } else {
            return code;
        }
    }

    @Override
    public String toString() {
        return getErrorCodeOrResult();
    }
}

class Errors {
    static int NoErrors = -100;
    static int DifferentArraysLength = -1;
    static int DivisionByZero = -2;
}
