package HomeWork3.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateValidator {
    public static final int SPACENUMBER = 5;

    public static int dataIsValid(String inputData) {

        int spaceCounter = 0;

        for (int i = 0; i < inputData.length(); i++) {
            if (inputData.charAt(i) == ' ') {
                spaceCounter++;
            }
        }

        if (spaceCounter != SPACENUMBER) {
            return -1;
        }

        return -100;
    }

    public static void dateIsValid(String inputDate) throws ParseException {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        format.setLenient(false);
        calendar.setTime(format.parse(inputDate));
    }
}
