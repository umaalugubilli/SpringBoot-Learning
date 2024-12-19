package com.mahesh.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
	
	public int[] retrieveData() {
		
		//throw new RuntimeException("Something Went Wrong!");
		return new int[] {11, 22, 33, 44, 55};
	}

}
