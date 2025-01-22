package com.sl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
