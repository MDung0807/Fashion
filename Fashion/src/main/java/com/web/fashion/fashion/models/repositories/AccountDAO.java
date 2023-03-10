package com.web.fashion.fashion.models.repositories;


import com.web.fashion.fashion.models.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

}
