package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserRepository repo;
	
	public long save(User u) { return (repo.save(u) != null) ? 1 : 0;}
	public long delete(User u) { repo.delete(u); return (getOne(u.getUserNum()) == null) ? 1 : 0;}
	public long count() { return repo.count();}
	public List<User> findAll() { return repo.findAll();}
	public User getOne(long id) { return repo.getOne(id);}
	public Optional<User> findById(long id){ return repo.findById(id);}
	public boolean existsById(long id) { return repo.existsById(id);}
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		// Let people login with either username or email
		User user = repo.findByUseridOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow(
				() -> new UsernameNotFoundException("User not found with username or email : " + usernameOrEmail));

		return UserDto.create(user);
	}

	// This method is used by JWTAuthenticationFilter
	@Transactional
	public UserDetails loadUserById(Long id) {
		User user = repo.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + id));

		return UserDto.create(user);
	}
}
