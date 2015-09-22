package hello;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String GreetingTemplate = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
		return new GreetingInstance(counter.incrementAndGet(),
			String.format(GreetingTemplate,name));
	}

    @RequestMapping("/databases")
    public Databases getAllDatabases(){
        //TODO should return list of all databases
        return new Databases(counter.incrementAndGet(),Arrays.asList("prod", "dev")) ;
    }
}