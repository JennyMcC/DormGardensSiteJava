package dormGardens.com.dormGardens;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DormGardensPopulator implements CommandLineRunner {

	@Resource
	private PlantRepo plantRepo;
	
	public void run(String... args) throws Exception {
		
		Plant plant1 = new Plant("Ironwood Succulent Planter", "/images/plant1.jpg");
		Plant plant2 = new Plant("Marblewood Succulent Planter", "/images/plant2.jpg");
		Plant plant3 = new Plant("African Padauk Succulent Planter", "/images/plant3.jpg");
		
		plantRepo.save(plant1);
		plantRepo.save(plant2);
		plantRepo.save(plant3);
		
	}
}
