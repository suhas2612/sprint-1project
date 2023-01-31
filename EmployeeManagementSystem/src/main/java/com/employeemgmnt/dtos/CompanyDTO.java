package com.employeemgmnt.dtos;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDTO {
	@NotNull(message="Company Id should not be Null")
	private Integer Id;
	
	@NotBlank(message="Emptiness is not allowed")
	@NotNull(message="Null is not allowed")
	@Size(min=4,max=20,message="Name must be in the range 4-20 characters")
	private String name;
	
	@NotBlank(message="Emptiness is not allowed")
	@NotNull(message="Null is not allowed")
	@Size(min=3,max=30,message="Location name must be in the range 3-30 characters")
	private String location;
	
	@Pattern(regexp="\\d{6}",message="Invalid Pincode")
	private String pincode;
}
