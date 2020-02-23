package com.chaiyining.service.impl;

import com.chaiyining.service.MathService;

public class MathServiceImpl implements MathService{

	@Override
	public int puls(int i, int j) {
		
		return i+j;
	}

	@Override
	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}
