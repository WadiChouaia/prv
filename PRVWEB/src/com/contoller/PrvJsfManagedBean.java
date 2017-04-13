/**
 * 
 */
package com.contoller;

import java.io.Serializable;
import java.util.List;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.entity.*;
import com.ejb.PRVEntityFacade;
@Named("prvJsfManagedBean")
@SessionScoped
public class PrvJsfManagedBean implements Serializable {

	@EJB
	//declaration des attribues
	//model du prv
	private com.ejb.PRVEntityFacade pRVEntityFacade;
	//classe entité du prv
	private PRVEntity prvEntity ;
	//liste des entité prv 
	private List<PRVEntity> items = null;
	private static final long serialVersionUID = 8904057979552029913L;
	
	//methode pour lister tout les prv dans la base
	public List<PRVEntity> finadAll(){
		return this.pRVEntityFacade.findAll();
	}
	
	public String add(){
		pRVEntityFacade.create(this.prvEntity);
		return "added";
	}
	
	

	public List<PRVEntity> getItems() {
		return items;
	}

	public void setItems(List<PRVEntity> items) {
		this.items = items;
	}

	public PRVEntityFacade getpRVEntityFacade() {
		return pRVEntityFacade;
	}

	public void setpRVEntityFacade(PRVEntityFacade pRVEntityFacade) {
		this.pRVEntityFacade = pRVEntityFacade;
	}

	public PRVEntity getPrvEntity() {
		return prvEntity;
	}

	public void setPrvEntity(PRVEntity prvEntity) {
		this.prvEntity = prvEntity;
	}
	public PrvJsfManagedBean() {
		
		}
	
}
