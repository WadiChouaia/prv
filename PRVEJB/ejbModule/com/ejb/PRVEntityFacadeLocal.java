package com.ejb;

import java.util.List;

import javax.ejb.Local;

import com.entity.PRVEntity;

@Local
public interface PRVEntityFacadeLocal {

	void create(PRVEntity pRVEntity);

	void edit(PRVEntity pRVEntity);

	void remove(PRVEntity pRVEntity);

	PRVEntity find(Object id);

	List<PRVEntity> findAll();

	List<PRVEntity> findRange(int[] range);

	int count();
}
