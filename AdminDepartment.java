package com.himakshi.model;

public class AdminDepartment extends SuperDepartment{
    public String departmentName() {
    	return("Welcome to Admin Department");
    }
    
    public String getTodaysWork() {
    	return ("complete your documents submission");
    	
    }
    public String getWorkDeadline() {
    	return ("complete by EOD");
    	
    }
    
}