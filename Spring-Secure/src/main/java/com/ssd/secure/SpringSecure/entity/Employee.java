package com.ssd.secure.SpringSecure.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rmp_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Long empId;
	private String ename;
	private String address;

}
