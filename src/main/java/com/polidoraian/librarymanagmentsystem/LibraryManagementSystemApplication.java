package com.polidoraian.librarymanagmentsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		log.debug("Testing logging features");
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

}
