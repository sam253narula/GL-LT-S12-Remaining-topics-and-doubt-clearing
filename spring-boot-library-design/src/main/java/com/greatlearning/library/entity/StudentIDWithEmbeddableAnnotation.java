package com.greatlearning.library.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentIDWithEmbeddableAnnotation implements Serializable {
	
	private int id;
	
	private String passportNumber;
}
