package com.example.JpaAuthentication.JpaAuthentication;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends JpaRepository<ExcellenceClass,String> {
	
	
	Optional<ExcellenceClass> findByUserName(String id);

}
