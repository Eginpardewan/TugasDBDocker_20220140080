package com.praktikum7.deploy7.repository;

import com.praktikum7.deploy7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, String> {
}
