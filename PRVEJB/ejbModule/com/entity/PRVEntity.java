package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PRVEntity
 *
 */
@Entity

@SqlResultSetMapping(
        name= "SumMontant",
        classes = @ConstructorResult(
                targetClass = PrvEntitySum.class,
                columns = {
                    @ColumnResult(name = "matriculeEmployee" , type = Integer.class),
                    @ColumnResult(name = "codeCard", type = Integer.class),
                    @ColumnResult(name = "DatePRV", type = Date.class),
                    @ColumnResult(name = "montant", type = Double.class),
                    @ColumnResult(name = "sumMontant", type = Double.class),
                    
                }
        )
)


@IdClass(PrimeryKey.class)
public class PRVEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int matriculeEmployee;
	@Id
	private int codeCard;
	@Id
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date datePRV;

	private double montant;

	public PRVEntity() {
		super();
	}

	public PRVEntity(int matriculeEmployee, int codeCard, Date datePRV, double montant) {
		super();
		this.matriculeEmployee = matriculeEmployee;
		this.codeCard = codeCard;
		this.datePRV = datePRV;
		this.montant = montant;
	}

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

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codeCard;
		result = prime * result + ((datePRV == null) ? 0 : datePRV.hashCode());
		result = prime * result + matriculeEmployee;
		long temp;
		temp = Double.doubleToLongBits(montant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PRVEntity other = (PRVEntity) obj;
		if (codeCard != other.codeCard)
			return false;
		if (datePRV == null) {
			if (other.datePRV != null)
				return false;
		} else if (!datePRV.equals(other.datePRV))
			return false;
		if (matriculeEmployee != other.matriculeEmployee)
			return false;
		if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PRVEntity [matriculeEmployee=" + matriculeEmployee + ", codeCard=" + codeCard + ", datePRV=" + datePRV
				+ ", montant=" + montant + "]";
	}

}
