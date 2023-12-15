package diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Write {
    @GetMapping("/kirjoita")
    public String write() {
        return "write";
    }
    @PostMapping("/kirjoita")
    public String writeDiary(@RequestParam("teksti")String teksti){
        return "home";
    }


}
