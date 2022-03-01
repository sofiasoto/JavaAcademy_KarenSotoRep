package com.demo.steps;

import java.util.List;

import com.demo.steps.entities.Task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tasks")
public class TaskS1Controller{

	@GetMapping("/all")
	public ResponseEntity<List<Task>> fetchAllTask(){


		//return ResponseEntity.ok("localhost:8080/tasks");
        //return ResponseEntity.ok().body("all tasks");
        return null;
	}

	@PostMapping("/save")
	public ResponseEntity<Task> postTask(Task newTask){
		//return ResponseEntity.status(HttpStatus.CREATED).body("task created");
        return null;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteTask(Long taskId){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@PutMapping("/update")
	public ResponseEntity<Task> putTask(Long taskId, Task updatedTask){
		//return ResponseEntity.ok().body("update");
        return null;
	}
}