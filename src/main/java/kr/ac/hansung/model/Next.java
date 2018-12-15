package kr.ac.hansung.model;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Next {
	
	@Size(min=2, max=100, message="Name must be between 2 and 100 chars")
	private String name;
	
	@Size(min=5, max=100, message="Text must be between 5 and 100 chars")
	private String text;

}
