package metier;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

@Entity("article")
@Indexes(
		@Index(value = "stars", fields = @Field("stars"))
)
public class Article {

	@Id
	private ObjectId id;
	private String name;
	@Property("stars")
	private int stars;
	@Reference
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
