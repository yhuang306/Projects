package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chineseDrama")
public class ChineseDramaController {
    private final ChineseDramaService chineseDramaService;

    public ChineseDramaController (ChineseDramaService chineseDramaService) {
        this.chineseDramaService = chineseDramaService;
    }


    @GetMapping("/all")
    public List<ChineseDrama> getChineseDrama() {
        return chineseDramaService.all();
    }

    @CrossOrigin
    @PostMapping
    public ChineseDrama save(@RequestBody ChineseDrama chineseDrama) {
        return chineseDramaService.save(chineseDrama );
    }


    @PutMapping("/{id}")
    public void updateChineseDrama(@RequestBody ChineseDrama chineseDrama, @PathVariable Integer id) {
        chineseDramaService.update(chineseDrama, id);

    }


    @DeleteMapping("/{id}")
    public void deleteChineseDrama(@PathVariable Integer id ){
        chineseDramaService.delete(id);

    }

}
