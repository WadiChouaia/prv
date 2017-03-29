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
	private PRVEntityFacade pRVEntityFacade;
	private PRVEntity prvEntity ;
	private List<PRVEntity> items = null;
	private static final long serialVersionUID = 8904057979552029913L;
	
	
	public PrvJsfManagedBean() {
		// TODO Auto-generated constructor stub
	}

	public List<PRVEntity> finadAll(){
		if (items == null) {
            items = getpRVEntityFacade().findAll();
        }
        return items;
	}
	
	public String add(){
		pRVEntityFacade.create(this.prvEntity);
		return "add";
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
	
	
}
