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
	public String fetchPlants(@RequestParam("id") long id, Model model) {
		model.addAttribute(plantRepo.findOne(id));
		return "plants";
	}

}
