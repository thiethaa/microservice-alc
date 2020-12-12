package com.autobots.autobotsquestionnare.repository;

import com.autobots.autobotsquestionnare.entity.Questionnare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionnareRepository extends JpaRepository<Questionnare,String> {
}
