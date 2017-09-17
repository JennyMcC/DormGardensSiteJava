package dormGardens.com.dormGardens;

import static org.apache.commons.collections4.CollectionUtils.intersection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class FilteredPlantRepo {

	@Resource
	private PlantRepo plantRepo;
	
	@Resource
	private TagsRepo tagsRepo;
	
	public Collection<Plant> findForTagsNamed(String[] tagNames) {
		
		Set<Tags> selectedTags = tagsRepo.findByNameIn(tagNames);
		
		Iterator<Tags> tagsItr = selectedTags.iterator();
		Set<Plant> currentTagsPlants = tagsItr.next().getPlants();
		Collection<Plant> tagged = new HashSet<>(currentTagsPlants);
		while (tagsItr.hasNext()) {
			currentTagsPlants = tagsItr.next().getPlants();
			tagged = intersection(tagged, currentTagsPlants);
		}
		return tagged;
	}
}
