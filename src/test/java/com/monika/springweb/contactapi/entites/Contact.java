package com.monika.springweb.contactapi.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String Name;
	private String Phone;
	private String Email;
	public long getId() {
		return id;
	}
	public void SetId(long id)
	{
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void SetName(String Name)
	{
		this.Name = Name;
	}
	public String getPhone() {
		return Phone;
	}
	public void SetPhone(String phone)
	{
		this.Phone = phone;
	}
	public String getEmail() {
		return Phone;
	}
	public void SetEmail(String Email)
	{
		this.Email = Email;
	}
	
	
}
