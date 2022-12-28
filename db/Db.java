package db;

import java.util.ArrayList;

import model.AddressModel;
import model.SubscriberModel;
import model.TelephoneMadel;


public class Db {
    ArrayList<SubscriberModel> subscriber = new ArrayList<>();
    ArrayList<TelephoneMadel> telephone = new ArrayList<>();
    ArrayList<AddressModel> address = new ArrayList<>();
}

public class Infrastructure {
    // запуск создания БД
    public Infrastructure() {
        init();
    }

    Db db;

    // готовая база данных
    public Db getDb() {
        return db;
    }

    Db init() {
        db = new Db();
        SubscriberModel s1 = new SubscriberModel(1, "Сергей", "Соколов", "08.01.93");
        SubscriberModel s2 = new SubscriberModel(2, "Кирилл", "Ярославцев", "17.09.1990");
        SubscriberModel s3 = new SubscriberModel(3, "Мария", "Суворова", "12.04.1997");

        db.subscriber.add(s1);
        db.subscriber.add(s2);
        db.subscriber.add(s3);

        db.telephone.add(new TelephoneMadel(1, 56784, 1));
        db.telephone.add(new TelephoneMadel(2, 64295, 2));
        db.telephone.add(new TelephoneMadel(3, 97560, 3));

        return db;
    }

}
