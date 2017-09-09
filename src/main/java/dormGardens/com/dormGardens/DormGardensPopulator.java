package dormGardens.com.dormGardens;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DormGardensPopulator implements CommandLineRunner {

	@Resource
	private PlantRepo plantRepo;
	
	@Resource
	private TagsRepo tagsRepo;
	
	public void run(String... args) throws Exception {
		
		Tags price15 = new Tags("$15");
		Tags price20 = new Tags("$20");
		Tags light = new Tags("light");
		Tags medium = new Tags("medium");
		Tags dark = new Tags("dark");
		
		tagsRepo.save(price15);
		tagsRepo.save(price20);
		tagsRepo.save(light);
		tagsRepo.save(medium);
		tagsRepo.save(dark);
		
		
		Plant plant1 = new Plant("Ironwood Succulent Planter", "/images/plant1.jpg", "15", price15, medium);
		Plant plant2 = new Plant("Marblewood Succulent Planter", "/images/plant2.jpg", "15", price15, light);
		Plant plant3 = new Plant("African Padauk Succulent Planter", "/images/plant3.jpg", "15", price15, medium);
		
		plantRepo.save(plant1);
		plantRepo.save(plant2);
		plantRepo.save(plant3);
		
	}
}
