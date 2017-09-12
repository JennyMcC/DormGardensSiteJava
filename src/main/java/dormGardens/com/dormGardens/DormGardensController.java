package dormGardens.com.dormGardens;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DormGardensController {
	
	@Resource
	private PlantRepo plantRepo;
	
	@Resource
	private TagsRepo tagsRepo;
	
	@RequestMapping("/DormGardens")
	public String fetchPlant(Model model) {
		model.addAttribute("plant", plantRepo.findAll());
		model.addAttribute("tags", tagsRepo.findAll());
		return "DormGardens";
	}
	
	@RequestMapping("/plant")
	public String fetchPlant(@RequestParam("id") long id, Model model) {
		model.addAttribute(plantRepo.findOne(id));
		return "plant";
	}
	
	@RequestMapping("/tag")
	public String fetchTag(@RequestParam("id") long id, Model model) {
		model.addAttribute(tagsRepo.findOne(id));
		return "tag";
	}

}
