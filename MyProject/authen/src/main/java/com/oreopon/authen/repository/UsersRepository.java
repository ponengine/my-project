package com.oreopon.authen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oreopon.authen.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
