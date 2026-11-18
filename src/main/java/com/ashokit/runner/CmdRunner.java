package com.ashokit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(" Cmd Runner is Ru nig");
		
	}

}
