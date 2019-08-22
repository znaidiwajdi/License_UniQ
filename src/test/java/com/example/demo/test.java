package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
interface Rideable { 
	
	String getGait(); 
	
} 
public class test implements Rideable{
	
	
	int weight = 2;
	public String getGait() { return " mph, lope"; } 
	void go(int speed) { 
		++speed; weight++;  
		System.out.print(speed);
		System.out.print(weight);

		int walkrate = speed * weight;  
		System.out.print(walkrate + getGait());
		
	}    
	
	public static void main(String[] args) {   
		new test().go(8);  
		
	} 
}  
