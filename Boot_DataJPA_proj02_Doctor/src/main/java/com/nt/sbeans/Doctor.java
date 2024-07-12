package com.nt.sbeans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="doctor_tab")

@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	private Integer id;
	
	@Column(length=20)
	private String docName;
	
	@Column(length=20)
	private String specialization;
	
	private  Double income;
	
	
	
}
