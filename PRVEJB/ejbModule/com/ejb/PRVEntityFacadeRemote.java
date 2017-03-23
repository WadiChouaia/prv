package com.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.entity.PRVEntity;

@Remote
public interface PRVEntityFacadeRemote {
	
	void create(PRVEntity pRVEntity);

	void edit(PRVEntity pRVEntity);

	void remove(PRVEntity pRVEntity);

	PRVEntity find(Object id);

	List<PRVEntity> findAll();

	List<PRVEntity> findRange(int[] range);

	int count();
}
