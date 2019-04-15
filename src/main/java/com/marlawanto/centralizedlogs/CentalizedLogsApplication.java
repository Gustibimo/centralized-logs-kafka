package com.marlawanto.centralizedlogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

@SpringBootApplication
public class CentalizedLogsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CentalizedLogsApplication.class, args);
		Timer timer = new Timer();
		timer.schedule(new WelcomeLogs(), 0, 5000);

	}


}
class WelcomeLogs extends TimerTask {
	private Logger logger = Logger.getGlobal();

	public void run(){
		logger.info("Log this bro");
	}
}
