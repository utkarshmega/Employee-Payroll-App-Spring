package com.capgemini.employeeparollappspring.dto;

public class ResponseDTO {
	private String message;
	private Object data;
	
	public ResponseDTO(String message, Object data) {
		//super();
		this.setMessage(message);
		this.setData(data);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
