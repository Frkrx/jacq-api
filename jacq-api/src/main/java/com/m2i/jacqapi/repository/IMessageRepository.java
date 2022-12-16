package com.m2i.jacqapi.repository;

import com.m2i.jacqapi.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageRepository extends JpaRepository<Message,Long> {
}
