package com.learningspring.learn_spring_framework.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataBase implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] {11, 22, 33, 44, 55};
	}

}
