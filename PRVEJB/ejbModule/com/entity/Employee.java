package com.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

public class Employee implements Serializable {

	   
	@Id
	private Integer matricule;
	private Integer CIN;
	private String nom;
	private String prenom;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public Integer getMatricule() {
		return this.matricule;
	}

	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}   
	public Integer getCIN() {
		return this.CIN;
	}

	public void setCIN(Integer CIN) {
		this.CIN = CIN;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
   
}
