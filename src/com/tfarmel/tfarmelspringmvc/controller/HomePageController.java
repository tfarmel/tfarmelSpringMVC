package com.tfarmel.tfarmelspringmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.tfarmel.tfarmelspringmvc.domain.Employe;
import com.tfarmel.tfarmelspringmvc.service.EmployeManager;
import com.tfarmel.tfarmelspringmvc.service.IEmployeManager;

public class HomePageController extends AbstractController {
	
	private IEmployeManager employeManager;
	
	public void setEmployeManager(EmployeManager employeManager) {
		this.employeManager = employeManager;
	}


	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<Employe> listeEmployes = employeManager.getAllEmployes();
		return new ModelAndView("home", "employes", listeEmployes);
	}

}
