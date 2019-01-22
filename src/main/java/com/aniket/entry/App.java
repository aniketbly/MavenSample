package com.aniket.entry;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.aniket.model.Student;

public class App {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Aniket");
		student1.setCity("Noida");
		
		Student student2 = new Student();
		student2.setId(102);
		
		student2.setCity("");
		List<Student> students=Arrays.asList(student1,student2);
		//--Feature of java 8
		students.forEach(student->{
			
			if(StringUtils.isBlank(student.getCity())) {
				System.out.println("City cannot be blank.");
			}
			
			if(StringUtils.isBlank(student.getName())) {
				System.out.println("Name cannot be blank.");
			}
		});
		
		
	}

}
