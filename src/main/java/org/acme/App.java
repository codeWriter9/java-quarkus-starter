package org.acme;

import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.Quarkus;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusMain
@Slf4j
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String [] args) {
		System.out.println("Quarkus Application");
		log.info("SLF4J LOGGING --- Quarkus Application --- ");
		Quarkus.run(args);
	}
}
