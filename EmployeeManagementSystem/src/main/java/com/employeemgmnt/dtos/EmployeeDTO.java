package com.employeemgmnt.dtos;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.employeemgmnt.entities.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
	@NotBlank(message="Emptiness is not allowed")
	@NotNull(message="Null is not allowed")
	@Size(min=4,max=20,message="Name must be in the range 4-20 characters")
	private String name;
	
	@Min(value=21,message="Invalid age")
	@Max(value=30,message="Invalid age")
	private Integer age;
	
	@Email(message="Invalid Email format")
	private String emailId;
	
	@Pattern(regexp="\\d{10}",message="Invalid MobileNumber")
	private String mobileNo;
	
	private Company company;
	
}
