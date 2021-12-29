package com.amrit.ipldashboard.Repositories;

import java.util.List;

import com.amrit.ipldashboard.model.Match;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long>{
    
    List <Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);
}
