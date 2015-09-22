package hello;

public class GreetingInstance extends Greeting {
    private final String content;

    public GreetingInstance(long id, String content) {

        super(id);
        this.content = content;
    }


    public String getContent(){
        return content;
    }
}