package com.tfarmel.tfarmelspringmvc.dao;

import java.util.List;

import com.tfarmel.tfarmelspringmvc.domain.Employe;

public interface IEmployeDao {
	
	public void seveEmploye(Employe em);
	public Employe getEmployeById(int id);
	public Employe getEmployeByLogin(String login);
	public int getEmployesCount();
	public List<Employe> getAllEmployes();

}
