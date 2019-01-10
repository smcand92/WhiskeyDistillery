package com.codeclan.example.WhiskyDistillery;

import com.codeclan.example.WhiskyDistillery.distilleryRepositories.DistilleryRepository;
import com.codeclan.example.WhiskyDistillery.models.Distillery;
import com.codeclan.example.WhiskyDistillery.models.Whisky;
import com.codeclan.example.WhiskyDistillery.whiskyRepositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyDistilleryApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createWhiskey(){

		Distillery glendronach = new Distillery("Glendronach", "Islay");
		distilleryRepository.save(glendronach);

		Whisky revival = new Whisky("The Glendronach-Revival", glendronach, 2002, 17);
		whiskyRepository.save(revival);

	}
}

