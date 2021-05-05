package com.ennaoumi.ams;

import com.ennaoumi.ams.entities.Planning;
import com.ennaoumi.ams.services.IPlanningService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

@Slf4j
@SpringBootApplication
public class AmsApplication implements CommandLineRunner {
	@Autowired
	private IPlanningService planningService;
	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Planning planning = Planning.builder()
							.duration(5)
							.endAfternoon(LocalTime.now())
							.startAfternoon(LocalTime.now())
							.startDate(LocalDate.now())
							.endDate(LocalDate.now())
							.name("A")
							.endMorning(LocalTime.now())
							.startMorning(LocalTime.now())
							.build();
		log.info("saving planning : {}",planning);
		planningService.save(planning);

	}
}
