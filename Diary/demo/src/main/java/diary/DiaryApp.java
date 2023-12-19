package diary;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("diary")
public class DiaryApp {

	public static void main(String[] args) {
		SpringApplication.run(DiaryApp.class, args);
	}
}
