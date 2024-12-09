package com.mahesh.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount=0;
	
	static {
		todos.add(new Todo(++todosCount, "in28minutes","Learn AWS", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(++todosCount, "in28minutes","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(++todosCount, "in28minutes","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteTodoById(int id) {
			
		Predicate<? super Todo> Predicate = todo ->todo.getId()==id;
		todos.removeIf(Predicate);
	}

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> Predicate = todo ->todo.getId()==id;
		Todo todo = todos.stream().filter(Predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteTodoById(todo.getId());
		todos.add(todo);
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	

}
