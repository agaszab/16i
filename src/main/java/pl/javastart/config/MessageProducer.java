package pl.javastart.config;

public class MessageProducer implements Producer {

    public  String getMessage(){
        return "Example message"+ System.currentTimeMillis();
    }
}
