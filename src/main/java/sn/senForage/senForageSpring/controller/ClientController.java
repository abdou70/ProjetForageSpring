package sn.senForage.senForageSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sn.senForage.senForageSpring.dao.IClient;
import sn.senForage.senForageSpring.dao.IVillage;
import sn.senForage.senForageSpring.entities.Client;
import sn.senForage.senForageSpring.entities.Village;

@Controller
public class ClientController {
	@Autowired
	private IClient clientdao;
	@Autowired
	private IVillage villagedao;
	
	@RequestMapping(value="Client/liste")
	public String liste(ModelMap model) {
		
		List<Client> clients = clientdao.findAll();
		List<Village> village = villagedao.findAll();
		model.put("liste_clients", clients);
		model.put("liste_village",village);
		return "client/liste";
	}
	
	@RequestMapping(value="Client/add" , method=RequestMethod.POST)
	public String liste(String nom,String adresse,String telephone,int id_village) {
		ModelAndView modelAndView = new ModelAndView();
		
		Client client = new Client();
		client.setNom(nom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
		Village village = new Village();
		village = villagedao.getOne(id_village);
		
		client.setVillage(village);
		try {
		clientdao.save(client);
		modelAndView.addObject("result",new String("Donnees ajoutees"));
		} catch(Exception e){
			modelAndView.addObject("result",new String("Donnees non ajoutees"));
		}
		
		return "redirect:/Client/liste";
		
	}
	}
	

