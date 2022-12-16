package com.m2i.jacqapi.repository;

import com.m2i.jacqapi.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChannelRepository extends JpaRepository<Channel,Long> {
}