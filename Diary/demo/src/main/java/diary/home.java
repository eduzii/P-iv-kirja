package diary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class home {
    @GetMapping("/")
    public String koti(){
        return "home";
    }
}
