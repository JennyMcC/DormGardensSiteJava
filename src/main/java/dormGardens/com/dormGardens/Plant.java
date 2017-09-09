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
	private double price;
	
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
	
	public double getPrice() {
		return price;
	}
	
	public Set<Tags> getTag() {
		return tag;
	}
	
	private Plant() {}
	
	
	public Plant(String name, String picture, double price, Tags...tag) {
		this.name = name;
		this.picture = picture;
		this.price = price;
		this.tag = new HashSet<>(Arrays.asList(tag));
	}
	
	
	
	

}
