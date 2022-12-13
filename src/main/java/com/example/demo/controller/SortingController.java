package com.example.demo.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/list")
public class SortingController {
	
	@PostMapping("/sort")
	public ResponseEntity<List<Integer>> validateTransferDetails(@RequestBody List<Integer> numbers){
		Collections.sort(numbers, new Comparator<Integer>() {		 

			@Override
			public int compare(Integer o1, Integer o2) {

				return Integer.compare(o1, o2);
              }
		});
		return ResponseEntity.ok().body(numbers);		
	}
}
