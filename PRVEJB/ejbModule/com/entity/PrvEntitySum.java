/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.Date;

/**
 *
 * @author wadi chouaia
 */
public class PrvEntitySum {
    private int codeCard;
    private int matriculeEmployee;
    private Date datePRV;
    private double montant;
    private double sumMontant;

    public PrvEntitySum(int matricule, int codeCard, Date Dateprv, double montant, double sumMontant) {
        this.codeCard = codeCard;
        this.matriculeEmployee = matricule;
        this.datePRV = Dateprv;
        this.montant = montant;
        this.sumMontant = sumMontant;
    }
    
    

    public int getCodeCard() {
        return codeCard;
    }

    public int getMatriculeEmployee() {
        return matriculeEmployee;
    }

    public Date getDatePRV() {
        return datePRV;
    }

    public double getMontant() {
        return montant;
    }

    public double getSumMontant() {
        return sumMontant;
    }

    public void setCodeCard(int codeCard) {
        this.codeCard = codeCard;
    }

    public void setMatriculeEmployee(int matriculeEmployee) {
        this.matriculeEmployee = matriculeEmployee;
    }

    public void setDatePRV(Date datePRV) {
        this.datePRV = datePRV;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setSumMontant(double sumMontant) {
        this.sumMontant = sumMontant;
    }
    
}
