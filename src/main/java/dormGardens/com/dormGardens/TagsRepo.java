package dormGardens.com.dormGardens;

import org.springframework.data.repository.CrudRepository;

public interface TagsRepo extends CrudRepository<Tags, Long> {
	
	Tags findByName(String name);
}
