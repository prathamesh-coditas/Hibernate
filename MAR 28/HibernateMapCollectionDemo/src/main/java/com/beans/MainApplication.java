package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration().configure("hbm.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {


            System.out.println("1:Enter Player Details\n2:Exit");
            HashMap<String, Players> map1 = new HashMap<>();
            int ch = Integer.parseInt(reader.readLine());
            if(ch == 1) {
                Transaction transaction = session.beginTransaction();
                System.out.println("Enter Coutry Name, Jersey No and Player Name");
                String country = reader.readLine();
                int jerseyNo = Integer.parseInt(reader.readLine());
                String playerName = reader.readLine();
                map1.put(country, new Players(jerseyNo, playerName));

                System.out.println("Set " + playerName + "to which team in IPL:" + "\nEnter Team id and Name:");
                int id = Integer.parseInt(reader.readLine());
                String iplTeam = reader.readLine();
                IplTeamDetails obj = new IplTeamDetails(id ,iplTeam, map1);
                session.save(obj);
                transaction.commit();
            } else if (ch == 2) {
                break;
            }
        }
        session.close();
    }
}
