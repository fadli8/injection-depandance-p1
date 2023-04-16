package Presentation;

import Dao.DaoImp;
import Dao.DaoImpl2;
import Metier.MetierImpl;

public class Présentation1 {
    public static void main(String[] args) {
        DaoImp dao=new DaoImp();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Res = "+metier.calcul());
    }
}
