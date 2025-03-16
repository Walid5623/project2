package net.walid.ext;

import net.walid.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoV2Impl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteur ........");

        double test = 12;
        return test;
    }
}
