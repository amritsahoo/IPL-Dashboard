package com.amrit.ipldashboard.Services;

import com.amrit.ipldashboard.Repositories.MatchRepository;
import com.amrit.ipldashboard.Repositories.TeamRepository;
import com.amrit.ipldashboard.model.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MatchRepository matchRepository;
  
    public Team getTeam(String teamName){
        
       Team team =  teamRepository.findByTeamName(teamName);
       Pageable pageable  = PageRequest.of(0, 4);
       team.setMatches(matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName, teamName,pageable));
       return team;
    }
}
