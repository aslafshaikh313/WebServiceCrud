package com.sppu.main.globalExceptionHandler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
//@RestControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ApiError> DataNotFoundExceptionHandler( DataNotFoundException e , HttpServletRequest request) {
		System.out.println("Handler");
		
		ApiError api=new ApiError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date(), HttpStatus.NOT_FOUND,request.getRequestURI());
		return new ResponseEntity<ApiError>(api,HttpStatus.NOT_FOUND);
	}
}
