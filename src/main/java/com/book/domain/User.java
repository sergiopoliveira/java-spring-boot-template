package com.book.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String name;

	@Email
	private String email;

	@ElementCollection
	private Map<String, Integer> feedback = new HashMap<>();

}
