package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Donner la classe de les couvhes DAO :");
        String DaoClassName=scanner.nextLine();
        Class cDao=Class.forName(DaoClassName);
        IDao Dao = (IDao) cDao.getConstructor().newInstance();

        System.out.print("Donner la classe de les couvhes Métier :");
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor().newInstance();

        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,Dao);

        System.out.println("Resultat : "+metier.calcul());


    }
}
