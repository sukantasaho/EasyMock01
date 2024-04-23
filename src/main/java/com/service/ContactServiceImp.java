package com.service;

import com.dao.IContactDAO;

public class ContactServiceImp implements IContactService{

	private IContactDAO dao;
	
	public ContactServiceImp(IContactDAO DAO)
	{
		this.dao = DAO;
	}
	@Override
	public String getNameById(Integer id) 
	{
		 String name = dao.findNameById(id);
		 String formattedName = name.toUpperCase();
		 
		return formattedName;
	}

}
