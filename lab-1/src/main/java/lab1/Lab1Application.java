package lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lab1.domain.Player;
import lab1.domain.Team;
import lab1.repository.TeamRepository;

@SpringBootApplication
public class Lab1Application {

    @Autowired
    TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

    @PostConstruct
    public void init() {
        List<Team> teams = new ArrayList<>();

        Set<Player> team1Players = new HashSet<>();
        team1Players.add(new Player("Ant 1", "Pitcher"));
        team1Players.add(new Player("Ant 2", "Catcher"));
        team1Players.add(new Player("Ant 3", "Shortstop"));
        teams.add(new Team("Agile Ants", "Antville", "Another Ant", team1Players));

        Set<Player> team2Players = new HashSet<>();
        team2Players.add(new Player("Bull 1", "Pitcher"));
        team2Players.add(new Player("Bull 2", "Catcher"));
        team2Players.add(new Player("Bull 3", "Shortstop"));
        teams.add(new Team("Brave Bulls", "Bull City", "Billy Bull", team2Players));

        Set<Player> team3Players = new HashSet<>();
        team3Players.add(new Player("Cow 1", "Pitcher"));
        team3Players.add(new Player("Cow 2", "Catcher"));
        team3Players.add(new Player("Cow 3", "Shortstop"));
        teams.add(new Team("Crazy Cows", "Cow Town", "Calm Cow", team3Players));

        Set<Player> team4Players = new HashSet<>();
        team4Players.add(new Player("Dolphin 1", "Pitcher"));
        team4Players.add(new Player("Dolphin 2", "Catcher"));
        team4Players.add(new Player("Dolphin 3", "Shortstop"));
        teams.add(new Team("Devil Dolphins", "Dolphin City", "Dolphin Dude", team4Players));

        teamRepository.save(teams);
    }
}
