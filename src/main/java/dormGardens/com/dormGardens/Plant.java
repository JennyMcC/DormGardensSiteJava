package dormGardens.com.dormGardens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plant {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String picture;
	private int price;
	private String planterColor;
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getPicture() {
		return picture;
	}
	public int getPrice() {
		return price;
	}
	public String getPlanterColor() {
		return planterColor;
	}
	
	public Plant(String name, String picture, int price, String planterColor) {
		this.name = name;
		this.picture = picture;
		this.price = price;
		this.planterColor = planterColor;
	}
	
	
	
	

}
