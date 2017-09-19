package dormGardens.com.dormGardens;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tags {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy="tag")
	private Set<Plant> plants;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Plant> getPlants() {
		return plants;
	}
	
	public Tags() {}
	
	public Tags(String name) {
		this.name = name;
	}
	
	
}
