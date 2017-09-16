package dormGardens.com.dormGardens;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface TagsRepo extends CrudRepository<Tags, Long> {
	
	Tags findByName(String name);
	Set<Tags> findByNameIn(String... names);
}
