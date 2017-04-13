
package com.ejb;

import com.entity.PRVEntity;
import com.entity.PrvEntitySum;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author wadi chouaia
 */
@Stateless
public class PRVEntityFacade extends AbstractFacade<PRVEntity> {

    @PersistenceContext(unitName = "PRVPRIMEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

 @SuppressWarnings("unchecked")
public List<PrvEntitySum> SommeMontant(){
     Query q;
     
     q=em.createNativeQuery("Select p.matriculeEmployee, p.codeCard, p.datePRV, p.montant, sum(p.montant)as sumMontant from prventity p GROUP BY p.matriculeEmployee"
                            , "SumMontant");
     return q.getResultList();
   }
 
    public PRVEntityFacade() {
        super(PRVEntity.class);
    }
    
}
