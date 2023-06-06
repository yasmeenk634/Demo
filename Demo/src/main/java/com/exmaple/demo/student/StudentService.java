package com.exmaple.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
	
	public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"Maryam",
						"Maryam.jamal@gmail.com",
						LocalDate.of(2023, 5, 23),
						21
					)
				);
	}

}
