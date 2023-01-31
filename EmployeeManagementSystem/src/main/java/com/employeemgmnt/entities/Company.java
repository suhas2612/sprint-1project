package com.employeemgmnt.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Company {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="CompanyId",length=10)
	private Integer id;
	@Column(name="CompanyName",length=20)  //Naming the column and defining the length of the column name
	private String name;
	@Column(name="CompanyLocation",length=30)
	private String location;
	@Column(name="LocationPincode",length=35)
	private String pincode;
}
