package com.tfarmel.tfarmelspringmvc.service;

import java.util.List;

import com.tfarmel.tfarmelspringmvc.domain.Employe;

public interface IEmployeManager {
	
	public Employe getEmploye(String login);
	public List<Employe> getAllEmployes();
	public void deleteEmployes();
	public void updateEmployes();
	public void createEmployes();
	public Employe getEmployeById(int id);

}
