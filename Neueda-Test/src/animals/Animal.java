package animals;

public class Animal {

	protected String name;

	//Constructors
	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	//Mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
