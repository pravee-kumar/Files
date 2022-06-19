package com.nagarro.assignment1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public int getAdd(int a,int b) {
		return a+b;
	}
	
	public int getSub(int a,int b) {
		return a-b;
	}
	
	public int getMul(int a,int b) {
		return a*b;
	}
	
	public int getDiv(int a,int b) {
		return a/b;
	}
}
