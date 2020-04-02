package com.example.demo;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	@Autowired
	TeamDao teamDao;

	/**
	 * Used when called JAR
	 * @param builder
	 * @return
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/**
	 * Used when called WAR
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}

	//To be able to saved the values.
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortStop"));
		Team team = new Team("Peanuts", "California",players);
		teamDao.save(team);

	}

}
