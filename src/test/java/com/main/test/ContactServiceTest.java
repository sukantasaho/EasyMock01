package com.main.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.dao.IContactDAO;
import com.service.ContactServiceImp;
import com.service.IContactService;

public class ContactServiceTest
{
	private static IContactDAO dao;
	private static IContactService service;
	
	@BeforeAll
	public static void createOnce()
	{
		dao = EasyMock.createMock(IContactDAO.class);
		System.out.println(dao.getClass());
		service = new ContactServiceImp(dao);
	}
	 @Test
     public void getNameByIDTest01()
     {    
    	 EasyMock.expect(dao.findNameById(101)).andReturn("Sukanta");
    	 EasyMock.expect(dao.findNameById(102)).andReturn("manoj");
    	 EasyMock.replay(dao);
    	 String name = service.getNameById(102);
    	 System.out.println(name);
    	 assertNotNull(name);
     }
}
