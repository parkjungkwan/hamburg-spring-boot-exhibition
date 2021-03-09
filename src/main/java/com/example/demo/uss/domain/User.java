package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.bkg.domain.Booking;
import com.example.demo.rev.domain.Review;

import lombok.Getter;


@Entity @Getter  @Table(name = "users")
public class User extends DateAudit {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_num") private long userNum;
	@Column private String userid;
	@Column private String password;
	@Column private String username;
	@Column private String email;
	@Column private String gender;
	@Column private String birthday;
	@Column(name = "phone_number") private String phoneNumber;
	@Column private String admin;
	@Column(name = "prefer_genre") private String preferGenre;
	
	@OneToMany(mappedBy = "user")
	private List<Analysis> analysisList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Booking> bookingList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Review> reviewList = new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_num"), inverseJoinColumns = @JoinColumn(name = "role_num"))
	private Set<Role> roles = new HashSet<>();

}
