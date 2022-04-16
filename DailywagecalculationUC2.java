package com.bridgelabz.EmpWageBuilder_Day4;

public class DailywagecalculationUC2 {
    static final int IS_FULL_TIME = 1;
    static final int WAGE_PER_HRS = 20;
    
    public static void main(String[] args) {

    	int emphrs = 0;
    	int empwage = 0;

    	double empcheck = Math.floor(Math.random() * 10) % 2;
    if (empcheck == IS_FULL_TIME)
    	emphrs = 8;
	else
		emphrs = 0;
    empwage = emphrs * WAGE_PER_HRS;
    System.out.println("Employee wage : " + empwage);
    }
}
