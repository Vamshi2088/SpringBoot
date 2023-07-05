package com.jdbc.control;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.daolayer.Daoimpl;
import com.jdbc.model.Employe;

@Controller
public class Controll {

	@Autowired
	public Daoimpl d;

	@GetMapping("/getall")
	public ModelAndView printall() {
		List<Employe> all = d.getAll();
		return new ModelAndView("list-emps","map",all);
	}
	

	@GetMapping("/form")
	public String form() {
		return "reg-form";
		
	}
	
	@PostMapping("/save")
	public String save(Employe e) {
		d.save(e);
		return "redirect:getall";
	}
	
	@GetMapping("/delete")
	public String del(@RequestParam("id") Integer i) {
		d.delete(i);
		return "redirect:getall";		
	}

	@GetMapping("/getbyid")
	public ModelAndView getbyid(@RequestParam("id") Integer i) {
	
			List<Employe> l = d.getbyid(i);
			Employe e = l.get(0);
			
			
		return new ModelAndView("update","u",e);
	
	}
	
	@PostMapping("/update")
	public String update(Employe e) {
		d.updatebyid(e);
		return "redirect:getall";
		
	}
	
}
