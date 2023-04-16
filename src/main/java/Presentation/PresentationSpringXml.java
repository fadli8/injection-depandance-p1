package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXml {
    public static void main(String[] args){
        ApplicationContext springContext = new ClassPathXmlApplicationContext("Config.xml");
        IMetier metier =(IMetier) springContext.getBean("Metier");
        System.out.println("Resul ="+metier.calcul());
    }
}
