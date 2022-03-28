package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Flim flim= new Flim();
        flim.setId(131);
        flim.setName("Shershah");

        List<Song> list= new ArrayList<>();
        list.add(new Song(1311,"Rataan Lambiyan"));
        list.add(new Song(1312,"Ranjha"));
        list.add(new Song(1313,"mann bhrayan"));
        list.add(new Song(1314,"title song"));

        flim.setSongs(list);
        System.out.println("*****************************************************");
        Flim flim1= new Flim();
        flim1.setId(141);
        flim1.setName("Pushpa");

        List<Song> list1=new ArrayList<>();
        list1.add(new Song(1411,"Shrivalli"));
        list1.add(new Song(1412,"Sammi"));
        list1.add(new Song(1413,"mera adda"));
        list1.add(new Song(1414,"Oantavaoantava"));

        flim1.setSongs(list1);

        session.save(flim);
        session.save(flim1);
        transaction.commit();

        session.close();




    }
}
