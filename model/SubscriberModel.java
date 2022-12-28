package model;

import java.time.LocalDate;

public class SubscriberModel {
    int id;
    String name;
    String surname;
    String birthDate;
    public SubscriberModel(int id, String name, String surname, String birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
}
