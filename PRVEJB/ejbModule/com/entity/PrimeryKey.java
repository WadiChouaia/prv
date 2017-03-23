/**
 * 
 */
package com.entity;

import java.util.Date;

import javax.persistence.Embeddable;

/**
 * @author wadi chouaia
 *
 */
@Embeddable
public class PrimeryKey implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int matriculeEmployee;
	private int codeCard;
	private Date datePRV;

	public int getMatriculeEmployee() {
		return matriculeEmployee;
	}

	public void setMatriculeEmployee(int matriculeEmployee) {
		this.matriculeEmployee = matriculeEmployee;
	}

	public int getCodeCard() {
		return codeCard;
	}

	public void setCodeCard(int codeCard) {
		this.codeCard = codeCard;
	}

	public Date getDatePRV() {
		return datePRV;
	}

	public void setDatePRV(Date datePRV) {
		this.datePRV = datePRV;
	}

	public PrimeryKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrimeryKey(int matriculeEmployee, int codeCard, Date datePRV) {
		super();
		this.matriculeEmployee = matriculeEmployee;
		this.codeCard = codeCard;
		this.datePRV = datePRV;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeCard;
		result = prime * result + ((datePRV == null) ? 0 : datePRV.hashCode());
		result = prime * result + matriculeEmployee;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimeryKey other = (PrimeryKey) obj;
		if (codeCard != other.codeCard)
			return false;
		if (datePRV == null) {
			if (other.datePRV != null)
				return false;
		} else if (!datePRV.equals(other.datePRV))
			return false;
		if (matriculeEmployee != other.matriculeEmployee)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrimeryKey [matriculeEmployee=" + matriculeEmployee + ", codeCard=" + codeCard + "datePRV=" + datePRV
				+ "]";
	}

}
