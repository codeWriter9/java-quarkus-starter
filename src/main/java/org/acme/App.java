package org.acme;

import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.Quarkus;

@QuarkusMain
public class App {

	public static void main(String [] args) {
		System.out.println("Quarkus Application");
		Quarkus.run(args);
	}
}
