package com.gareth.service;

import java.util.Optional;

import com.gareth.persistence.domain.Account;

public interface AccountService {

	Optional<Account> get(Long id);

	Iterable<Account> getAll();

	Account add(Account account);

	void delete(Long id);

}