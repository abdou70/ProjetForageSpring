package sn.senForage.senForageSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sn.senForage.senForageSpring.dao.IVillage;
import sn.senForage.senForageSpring.entities.Client;
import sn.senForage.senForageSpring.entities.Village;

@Controller
public class VillageController {
	@Autowired
	private IVillage villagedao;
	
	@RequestMapping(value="Village/liste")
	public ModelAndView liste() {
		
		List<Village> village = villagedao.findAll();
       return new ModelAndView("village/liste","liste_village", village);		
	}

	@RequestMapping(value="Village/add" , method=RequestMethod.POST)
	public String liste(String nom) {
		ModelAndView modelAndView = new ModelAndView();
		
		Village village = new Village();
		village.setNom(nom);
		
		try {
		villagedao.save(village);
		modelAndView.addObject("result",new String("Donnees ajoutees"));
		} catch(Exception e){
			modelAndView.addObject("result",new String("Donnees non ajoutees"));
		}
		
		return "redirect:/Village/liste";
		
	}
	
		

}
