package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("Conf.txt"));
        String DaoClassName=scanner.nextLine();
        Class cDao=Class.forName(DaoClassName);
        IDao Dao = (IDao) cDao.getConstructor().newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor().newInstance();

        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,Dao);

        System.out.println("Resultat : "+metier.calcul());


    }
}
