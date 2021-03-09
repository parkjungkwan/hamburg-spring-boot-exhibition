package com.example.demo.bkg.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.repository.BookingRepository;
import com.example.demo.cmm.service.AbstractService;

@Service @RequiredArgsConstructor
public class BookingServiceImpl extends AbstractService<Booking> implements BookingService{
	private final BookingRepository repo;
	
	@Override public long save(Booking b) { return (repo.save(b) != null) ?  1 : 0;}
	@Override public long delete(Booking b) { repo.delete(b); return (getOne(b.getBookNum()) == null) ? 1 : 0;}
	@Override public long count() { return (int)repo.count();}
	@Override public List<Booking> findAll() { return repo.findAll();}
	@Override public Booking getOne(long id) { return repo.getOne(id);}
	@Override public Optional<Booking> findById(long id){ return repo.findById(id);}
	@Override public boolean existsById(long id) { return repo.existsById(id);}
	@Override public long update(String bookName, String bookEmail, String bookPnumber, long bookNum) { 
		return repo.update(bookName, bookEmail, bookPnumber, bookNum);}
	@Override public List<Booking> findByBookNum(long bookNum) { return repo.findByBookNum(bookNum);}
}
