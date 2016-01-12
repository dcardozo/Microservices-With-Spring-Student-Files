package lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lab1.domain.Team;
import lab1.repository.TeamRepository;

/**
 * Created by david on 1/9/16.
 * @RestController anotation is commented when using Spring Data REST as
 * the controller will be implemented automatically.
 */
//@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping("/teams")
    Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }
}
