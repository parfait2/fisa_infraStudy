package com.fisa.infra.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisa.infra.model.entity.Reply;

@Repository
public interface ReplyDAO extends JpaRepository<Reply,String>{

}