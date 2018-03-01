package pl.javastart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    @Bean
    public MessageProducer messageProducer() {
        MessageProducer producer=new MessageProducer();
        return producer;
    }

    @Bean
    public MessagePrinter messagePrinter(MessageProducer producer){
        MessagePrinter messagePrinter=new MessagePrinter(producer);
        return messagePrinter;
    }

}
