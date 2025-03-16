package net.walid.pres;

import net.walid.dao.DaoImpl;
import net.walid.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Résultat: " + metier.calcul());
    }
}
