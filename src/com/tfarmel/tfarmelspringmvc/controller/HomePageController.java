package com.tfarmel.tfarmelspringmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.tfarmel.tfarmelspringmvc.domain.Employe;
import com.tfarmel.tfarmelspringmvc.service.EmployeManager;
import com.tfarmel.tfarmelspringmvc.service.IEmployeManager;

@Controller
public class HomePageController {
	// public class HomePageController extends AbstractController {
	private IEmployeManager employeManager;
	
	@Autowired
	public void setEmployeManager(EmployeManager employeManager) {
		this.employeManager = employeManager;
	}
	
	@RequestMapping("/home")
	public void home(Model model){
		List<Employe> listeEmployes = employeManager.getAllEmployes();
		model.addAttribute("employes", listeEmployes);
	}
	
	@RequestMapping("/list")
	public void list(Model model){
		List<Employe> listeEmployes = employeManager.getAllEmployes();
		model.addAttribute("employes", listeEmployes);
	}
	
	@RequestMapping("/employe")
	public void detailEmploye(Model model){
		Employe employe = employeManager.getEmployeById(1);
		model.addAttribute("employe", employe);
	}


//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		List<Employe> listeEmployes = employeManager.getAllEmployes();
//		return new ModelAndView("home", "employes", listeEmployes);
//	}

}
