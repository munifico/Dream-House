package com.ssafy.happy.deal.model.service;

import java.util.List;

import com.ssafy.happy.deal.dto.Interest;
import com.ssafy.happy.user.dto.User;
import com.ssafy.happy.deal.model.repo.InterestRepo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InterestServiceImpl implements InterestService {
	private final InterestRepo interestRepo;

	public InterestServiceImpl(InterestRepo dao) {
		this.interestRepo = dao;
	}

	@Override
	public List<Interest> getInterests(String id) {
		return interestRepo.selectAllInterests(id);
	}

	@Override
	@Transactional
	public int registerInterests(Interest interest) {
		return interestRepo.insertInterest(interest);
	}
}
