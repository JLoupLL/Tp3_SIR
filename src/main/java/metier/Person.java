package metier;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("person")
public class Person {
	@Id
	private ObjectId id;
	private String name;
	@Reference
	private Address address;
	
	public Person() {}
	
	public Person(ObjectId id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address=address;		
	}

	

	
	
}
