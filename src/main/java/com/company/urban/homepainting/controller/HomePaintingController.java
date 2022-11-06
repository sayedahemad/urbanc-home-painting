package com.company.urban.homepainting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.urban.homepainting.entity.HomePainting;
import com.company.urban.homepainting.service.HomePaintingService;

@Controller
public class HomePaintingController {

	@Autowired
	private HomePaintingService service;

	@RequestMapping("/homePainting")
	public String showAddService() {
		return "addService";
	}

	@RequestMapping("/saveService")
	public String saveService(@ModelAttribute("homePainting") HomePainting homePainting, ModelMap modelMap) {
		HomePainting serviceSaved = service.saveHomePainting(homePainting);
		String message="Service saved with id : "+ serviceSaved.getId();
		modelMap.addAttribute("message",message);
		return "addService";
	}
	
	@RequestMapping("/displayAllServices")
	public String displayServices(ModelMap modelMap) {
		List<HomePainting> services = service.getAllHomePaintings();
		modelMap.addAttribute("services",services);
		return "displayAllServices";
	}
	
	@RequestMapping("/addService")
	public String addService() {
		return "addService";
	}
	
	@RequestMapping("/editService")
	public String editService(@RequestParam("id")int id,ModelMap modelMap) {
		HomePainting currentService = service.getHomePaintingById(id);
		modelMap.addAttribute("service",currentService);
		return "updateService";
	}
	
	@RequestMapping("/updateService")
	public String showAll(@ModelAttribute("homePainting") HomePainting homePainting,ModelMap modelMap) {
		service.saveHomePainting(homePainting);
		List<HomePainting> services = service.getAllHomePaintings();
		modelMap.addAttribute("services",services);
		return "displayAllServices";
	}
	
	@RequestMapping("/deleteService")
	public String delteService(@RequestParam("id")int id,ModelMap modelMap) {
		HomePainting homePainting=new HomePainting();
		homePainting.setId(id);
		service.deleteHomePainting(homePainting);
		List<HomePainting> services = service.getAllHomePaintings();
		modelMap.addAttribute("services",services);
		return "displayAllServices";
		}
}
