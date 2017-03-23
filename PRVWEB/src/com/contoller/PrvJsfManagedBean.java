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
/**
 * @author wadi chouaia
 *
 */
public class PrvJsfManagedBean implements Serializable {

	@EJB
	private PRVEntityFacade pRVEntityFacade;
	private PRVEntity prvEntity = new PRVEntity();
	private static final long serialVersionUID = 8904057979552029913L;
	
	
	public PrvJsfManagedBean() {
		// TODO Auto-generated constructor stub
	}

	public List<PRVEntity> finadAll(){
		return this.pRVEntityFacade.findAll();
	}
	
	public String add(){
		pRVEntityFacade.create(this.prvEntity);
		return "add";
	}
}
