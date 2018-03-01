public class MessageProducer implements Producer {

    public  String getMessage(){
        return "Example message"+ System.currentTimeMillis();
    }
}
