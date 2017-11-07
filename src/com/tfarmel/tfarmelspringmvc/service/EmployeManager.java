package com.tfarmel.tfarmelspringmvc.service;

import java.util.ArrayList;
import java.util.List;

import com.tfarmel.tfarmelspringmvc.dao.IEmployeDao;
import com.tfarmel.tfarmelspringmvc.domain.Employe;

public class EmployeManager implements IEmployeManager {
	
	private IEmployeDao employeDao;

	public void setEmployeDao(IEmployeDao employeDao) {
		this.employeDao = employeDao;
	}
	
	public Employe getEmploye(String login){
		Employe employe = employeDao.getEmployeByLogin(login);
		return employe;
	}
	
	public Employe getEmploye(int id){
		Employe employe = employeDao.getEmployeById(id);
		return employe;
	}
	
	public List<Employe> getAllEmployes(){
		List<Employe> listAllEmployes = new ArrayList<Employe>();
		listAllEmployes = (List<Employe>) employeDao.getAllEmployes();
		return listAllEmployes;
	}

	
	public void deleteEmployes() {
		
	}

	
	public void updateEmployes() {
		
	}

	
	public void createEmployes() {
		
	}

	
	public Employe getEmployeById(int id) {
		Employe employe = employeDao.getEmployeById(id);
		return employe;
	}

}
