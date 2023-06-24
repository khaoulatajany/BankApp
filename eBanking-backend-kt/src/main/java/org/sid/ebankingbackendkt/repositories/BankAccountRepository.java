package org.sid.ebankingbackendkt.repositories;

import org.sid.ebankingbackendkt.entities.BankAccount;
import org.sid.ebankingbackendkt.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
