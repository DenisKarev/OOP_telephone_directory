package controllers;
import db.Db;
import model.SubscriberModel;


public class GetAllInfo {
    public String getAllInfo(int idSubscriber) {
        Db db = new Db();
        SubscriberModel s = db.subscriber.get(idSubscriber - 1);
    
        return String.format("%d %s %s %s",
            s.id,
            s.name,
            s.surname = surname;
            s.birthDate = birthDate;
            db.telephone.get(s.telephone - 1).name,
        )
      }
}
