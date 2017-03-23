package com.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.entity.PRVEntity;

/**
 *
 * @author wadi chouaia
 */
@Stateless
public class PRVEntityFacade extends AbstractFacade<PRVEntity> implements PRVEntityFacadeLocal, PRVEntityFacadeRemote {

    @PersistenceContext(unitName = "PRVEJB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PRVEntityFacade() {
        super(PRVEntity.class);
    }
    
}
