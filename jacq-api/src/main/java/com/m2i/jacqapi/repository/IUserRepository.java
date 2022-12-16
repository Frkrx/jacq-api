package com.m2i.jacqapi.repository;

import com.m2i.jacqapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
