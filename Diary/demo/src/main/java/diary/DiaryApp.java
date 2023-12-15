package diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DiaryApp {

	@GetMapping("*")
	@ResponseBody
	public String home() {
		return "home";
	}
	public static void main(String[] args) {
		SpringApplication.run(DiaryApp.class, args);
	}

}
