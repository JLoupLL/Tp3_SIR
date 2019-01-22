package metier;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

public class Article {

	private ObjectId id;
	private String name;
	private int stars;
	private List<Person> buyers;
	
	public Article() {}  
	
	public Article(ObjectId id, String name, int stars) {
		super();
		this.id = id;
		this.name = name;
		this.stars = stars;
		this.buyers=new ArrayList<Person>();
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	
}
