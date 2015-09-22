package hello;

public abstract class Greeting {
	protected final long id;

	
	public Greeting(long id) {
		this.id = id;

	}
	
	public long getId(){
		return id;
	}
	

}