package pl.javastart.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Maine2 {


    public static void main(String[] args)  {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);  // to klasa ze springa a applicationconfig.class to nasza konfiguracyjna klasa
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

    }
}