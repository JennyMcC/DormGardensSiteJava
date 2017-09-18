package dormGardens.com.dormGardens;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DormGardensController {
	
	@Resource
	private PlantRepo plantRepo;
	
	@Resource
	private TagsRepo tagsRepo;
	
	@Resource
	private FilteredPlantRepo filteredPlantRepo;
	
//	@RequestMapping("/DormGardens")
//	public String fetchPlant(Model model) {
//		model.addAttribute("plant", plantRepo.findAll());
//		model.addAttribute("tags", tagsRepo.findAll());
//		return "DormGardens";
//	}
	
	
	@RequestMapping("/DormGardens")
	public Iterable<Plant> allPlants() {
		Iterable<Plant> plants = plantRepo.findAll();
		return plants;
	}
	
	@RequestMapping("/DormGardens/byTags/{name}")
	public Iterable<Plant> plantsByTags(@PathVariable String[] name) {
		Iterable<Plant> plantsByTags = filteredPlantRepo.findForTagsNamed(name);
		return plantsByTags;
	}
	
//	@RequestMapping("/plant")
//	public String fetchPlant(@RequestParam("id") long id, Model model) {
//		model.addAttribute(plantRepo.findOne(id));
//		return "plant";
//	}
//	
//	@RequestMapping("/tag")
//	public String fetchTag(@RequestParam("id") long id, Model model) {
//		model.addAttribute("tags", tagsRepo.findAll());
//		model.addAttribute(tagsRepo.findOne(id));
//		return "tag";
//	}

}
