package com.gareth.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.persistence.domain.Account;
import com.gareth.persistence.repository.AccountRepository;
import com.gareth.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;

	public void setRepo(AccountRepository persist) {
		this.accountRepo = persist;
	}

	public Iterable<Account> getAll() {
		return accountRepo.findAll();
	}

	public Account add(Account account) {

		return accountRepo.save(account);
	}

	public void delete(Long id) {
		accountRepo.deleteById(id);
	}

	public Optional<Account> get(Long id) {
		return accountRepo.findById(id);
	}

}