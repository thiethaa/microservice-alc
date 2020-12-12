package com.autobots.alcautobotsbe.repository;

import com.autobots.alcautobotsbe.entity.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList,String> {
}
