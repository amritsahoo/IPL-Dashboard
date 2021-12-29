package com.amrit.ipldashboard.controllers;

import com.amrit.ipldashboard.Services.TeamService;
import com.amrit.ipldashboard.model.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
   
    @Autowired
    private TeamService teamService;

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {

        Team team = teamService.getTeam(teamName);

        return team;
    }
}
