package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
        IMetier iMetier =context.getBean(IMetier.class);
        System.out.println("Resul = "+iMetier.calcul());
    }
}
