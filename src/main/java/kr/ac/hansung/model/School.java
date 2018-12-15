package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class School {

	
	private int year;
	private int semester;
	private String code;
	private String name;
	private String section;
	private int score;
	
	
}
