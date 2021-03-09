package com.example.demo.uss.domain;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto implements UserDetails{
	private static final long serialVersionUID = 1L;
	//
	private long userNum;  // id
	private String userid; // username
	@JsonIgnore private String password;
	private String username; // name
	@JsonIgnore private String email;
	private String gender;
	private String birthday;
	private String phoneNumber;
	private String admin;
	private String preferGenre;
	// blog
	private Collection<? extends GrantedAuthority> authorities;

	public UserDto(long userNum, String username, String userid, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.userNum = userNum;
		this.username = username;
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserDto create(User user) {
		List<GrantedAuthority> authorities = 
				user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().name())).collect(Collectors.toList());

		return new UserDto(user.getUserNum(), user.getUserid(), user.getUsername(), user.getEmail(), user.getPassword(),
				authorities);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDto that = (UserDto) o;
		return Objects.equals(userNum, that.userNum);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userNum);
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

