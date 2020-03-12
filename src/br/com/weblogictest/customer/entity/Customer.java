package br.com.weblogictest.customer.entity;

public class Customer {
	private Long id;
	private String name;

	public Customer() {
		super();
	}
	
	public Customer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}