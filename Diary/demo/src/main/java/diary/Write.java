package diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Controller
public class Write {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/kirjoita")
    public String write() {
        return "write";
    }

    @PostMapping("/kirjoita")
    public String writeDiary(@RequestParam("title") String title, @RequestParam("content") String content){
        EventEntry entry = new EventEntry(title, content);
        entityManager.persist(entry);
        return "write";
    }
}
