package hello;

import java.util.List;

/**
 * Created by oo185005 on 9/22/2015.
 */
public class Databases extends Greeting {
    private final List<String> databases;

    public Databases(long id, List<String> databases) {
        super(id);
        this.databases = databases;
    }


    public List<String> getDatabases(){
        return databases;
    }
}
