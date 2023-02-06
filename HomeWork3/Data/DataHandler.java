package HomeWork3.Data;

import java.text.ParseException;
import java.util.HashMap;

import HomeWork3.InputException;
import HomeWork3.Person;

public class DataHandler {
    public static String[] personal_data = new String[] { 
            "lastName",
            "firstName",
            "patronymic",
            "birthDate",
            "phoneNumber",
            "gender" 
        };

    public static Person person;

    public static Person newData() {

        String inputData = DataReciever.newData();
        try {

            if (DateValidator.dataIsValid(inputData) == -1) {
                throw new InputException();
            }

            HashMap<String, String> personData = new HashMap<>();
            for (int i = 0; i < personal_data.length; i++) {
                personData.putIfAbsent(personal_data[i], inputData.split(" ")[i]);
            }

            DateValidator.toValidDate(personData.get("birthDate"));

            person = new Person(personData);
            return person;
        } catch (InputException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println("Введите дату корректно в формате dd.mm.yyyy\n");
        }
        return null;
    }
}
