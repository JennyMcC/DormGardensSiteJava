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
		Plant plant4 = new Plant("Walnut Succulent Planter", "images/plant4.jpg", "20", price20, medium);
		Plant plant5 = new Plant("Oak Succulent Planter", "images/plant5.jpg", "20", price20, light);
		Plant plant6 = new Plant("Cedar Succulent Planter", "images/plant6.jpg", "20", price20, medium);
		Plant plant7 = new Plant("Ironwood Succulent Planter", "images/plant7.jpg", "15", price15, medium);
		Plant plant8 = new Plant("Cedar Succulent Planter", "images/plant8.jpg", "20", price20, medium);
		Plant plant9 = new Plant("Purpleheart Succulent Planter", "images/plant9.jpg", "20", price20, dark);
		
		
		
		plantRepo.save(plant1);
		plantRepo.save(plant2);
		plantRepo.save(plant3);
		plantRepo.save(plant4);
		plantRepo.save(plant5);
		plantRepo.save(plant6);
		plantRepo.save(plant7);
		plantRepo.save(plant8);
		plantRepo.save(plant9);
		
	}
}
