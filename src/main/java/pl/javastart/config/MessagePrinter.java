package pl.javastart.config;

public class MessagePrinter {

    private Producer producer;
    public MessagePrinter (Producer producer){
        this.producer=producer;
    }

    public void printMessage(){
        String message=producer.getMessage();
        System.out.println(message);
    }
}
