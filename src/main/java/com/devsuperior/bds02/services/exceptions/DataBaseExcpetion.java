package com.devsuperior.bds02.services.exceptions;

public class DataBaseExcpetion extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataBaseExcpetion(String errMsg) {
		super(errMsg);
	}
}
