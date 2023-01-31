package com.employeemgmnt.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)   
	@Column(name="EmployeeId")   //naming the column in the table
	private Integer id;
	@Column(name="EmployeeName",length=20)
	private String name;
	@Column(name="EmployeeAge")
	private Integer age;
	@Column(name="EmployeeEmailId",length=25)
	private String emailId;
	@Column(name="EmployeeMobileNo.")
	private String mobileNo;
	
	// Mapping many employee to one company
	@ManyToOne(cascade=CascadeType.ALL)
	
	//joining the companyId column to Employee Table
	@JoinColumn(name="companyId")
	private Company company;
	

}
