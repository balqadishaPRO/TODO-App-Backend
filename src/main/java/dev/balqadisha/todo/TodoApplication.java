package dev.balqadisha.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class TodoApplication {
	Dotenv dotenv = Dotenv.load();
	String mongoUri = dotenv.get("MONGO_URI");
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
