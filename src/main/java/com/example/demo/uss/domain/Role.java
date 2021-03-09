package com.example.demo.uss.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity @Getter @Setter 
@NoArgsConstructor  @Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_num") private int roleNum;

	@Enumerated(EnumType.STRING)
	@NaturalId
	@Column(length = 60)
	private RoleName roleName;

	
}
