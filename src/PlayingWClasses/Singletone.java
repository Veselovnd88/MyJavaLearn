package PlayingWClasses;

public class Singletone {
	private String name;
	
	
	
	
	
	private static Singletone instance;
	private Singletone(String name) {setName(name);};
	
public static Singletone getInstance(String name) {
	if(instance==null) {
		instance = new Singletone(name);
	}
	return instance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
