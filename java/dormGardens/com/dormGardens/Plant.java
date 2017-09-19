package dormGardens.com.dormGardens;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Plant {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String picture;
	private String price;
	
	@ManyToMany
	private Set<Tags> tag;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public String getPrice() {
		return "price: $" + price;
	}
	
	public Set<Tags> getTag() {
		return tag;
	}
	
	@SuppressWarnings("unused")
	private Plant() {}
	
	
	public Plant(String name, String picture, String price) {
		this.name = name;
		this.picture = picture;
		this.price = price;
	}
	
	public Plant(String name, String picture, String price, Tags...tag) {
		this(name, picture, price);
		this.tag = new HashSet<>(Arrays.asList(tag));
	}
	
	
	

}
