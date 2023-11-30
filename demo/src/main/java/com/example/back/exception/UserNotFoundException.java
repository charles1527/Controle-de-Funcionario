package com.example.back.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Long id) {
		super("Não foi possivel achar o usuário com id " + id);
	}

}
