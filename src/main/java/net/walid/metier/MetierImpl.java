package net.walid.metier;

import net.walid.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
//    @Qualifier("d")
    private IDao dao;

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double daoData = dao.getData();
        double result = daoData * Math.PI / 12 * Math.cos(6);
        return result;
    }
}
