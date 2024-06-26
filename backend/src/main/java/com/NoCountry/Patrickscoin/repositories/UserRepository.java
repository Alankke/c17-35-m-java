package com.NoCountry.Patrickscoin.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NoCountry.Patrickscoin.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{

    public User findByEmail(String email);
}
