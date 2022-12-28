package model;

import java.time.LocalDate;
import java.util.Date;

public class SubscriberModel {
    int id;
    String name;
    String surname;
    Date birthDate;
    public SubscriberModel(int id, String name, String surname, Date birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
}
