package metier;

import org.bson.types.ObjectId;

public class Person {
	private ObjectId id;
	private String name;
	
	public Person() {}
	
	public Person(ObjectId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}