package com.te.ecommerspring.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.ecommerspring.beans.ItemResponse;
import com.te.ecommerspring.exp.ItemException;

@RestControllerAdvice
public class ItemRestControllerAdvice {

	@ExceptionHandler(ItemException.class)
	public ItemResponse handleEmployeeExp(ItemException exception) {
		ItemResponse response = new ItemResponse();
		response.setStatusCode(500);
		response.setMsg(exception.getMessage());
		return response;
	}
}
