package net.walid.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base donnée ........");

        double test = 34;
        return test;
    }
}
