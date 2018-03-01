import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{


        Odczyt od=new Odczyt();
        Producer producer=null;

        if (od.odczyt().equals("file")) {
             producer = new FileMessageProducer();
        } else if (od.odczyt().equals("simple"))
        { producer=new MessageProducer();
        } else {throw new IllegalStateException("Invalid config file!");}

        MessagePrinter printer=new MessagePrinter(producer);
        printer.printMessage();
    }
}
