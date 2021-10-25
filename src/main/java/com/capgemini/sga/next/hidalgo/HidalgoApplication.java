package com.capgemini.sga.next.hidalgo;

import com.capgemini.sga.next.hidalgo.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HidalgoApplication implements CommandLineRunner {

	@Autowired
	private ReaderService readerService;

	public static void main(String[] args) {
		SpringApplication.run(HidalgoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		readerService.readBook();
	}
}
