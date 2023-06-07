package com.example.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.location.entities.Location;
import com.example.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@RequestMapping("/showCreate")
	public String showCenter() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelmap) {
		// @ModelAttribute is used for get Object beans from front (req)
		// ModelMap is used for send data to web page
		Location locationData = service.saveLocation(location);
		String msg = "Data is Saved successfully with id" + locationData.getId();
		
		System.out.println(msg);
		modelmap.addAttribute("message", msg);
		return "createLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap modelmap) {
		// @ModelAttribute is used for get Object beans from front (req)
		// ModelMap is used for send data to web page
		Location locationData = service.saveLocation(location);
		String msg = "Data is updated successfully with id" + locationData.getId();
		List<Location> Alllocation = service.getAllLocation();
		modelmap.addAttribute("locations",Alllocation);
		return "displayLocation";
	}
	@RequestMapping("/displayAllLoc")
	public String displayAllLocation(ModelMap modelmap){
			List<Location> locations = service.getAllLocation();
			
			//System.out.println(locations);
			modelmap.addAttribute("locations",locations);
			return "displayLocation";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocationRow(@RequestParam("id") int id,ModelMap modelmap){
			Location locationById = service.getLocationById(id);
			System.out.println(locationById);
			service.deleteLocation(locationById);
			List<Location> locations = service.getAllLocation();
			
			//System.out.println(locations);
			modelmap.addAttribute("locations",locations);
			return "displayLocation";
	}
	
	@RequestMapping("/updateLocation")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelmap) {
		
		Location location = service.getLocationById(id);
		
		modelmap.addAttribute("location", location);
		
		return "editLocation";
	}
 }
