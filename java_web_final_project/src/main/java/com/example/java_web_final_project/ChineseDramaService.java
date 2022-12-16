package com.example.java_web_final_project;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ChineseDramaService {
    private final ChineseDramaRepository chineseDramaRepository;

    public ChineseDramaService(ChineseDramaRepository chineseDramaRepository){
        this.chineseDramaRepository = chineseDramaRepository;
    }


    public List<ChineseDrama> all() {
        return chineseDramaRepository.findAll();
    }

    public ChineseDrama save(ChineseDrama chineseDrama) {
        return chineseDramaRepository.save(chineseDrama);
    }

    public void delete(@PathVariable Integer id) {
        chineseDramaRepository.deleteById(id);
    }

    public void update(ChineseDrama chineseDrama, Integer id) {
        ChineseDrama chineseDramaToUpdate = chineseDramaRepository.findById(id).orElse(null);
        chineseDramaToUpdate.setDramaName(chineseDrama.getDramaName());
        chineseDramaToUpdate.setDirectorName(chineseDrama.getDirectorName());
        chineseDramaToUpdate.setActorName(chineseDrama.getActorName());
        chineseDramaToUpdate.setActressName(chineseDrama.getActressName());
        chineseDramaToUpdate.setYear(chineseDrama.getYear());
        chineseDramaToUpdate.setImageUrl(chineseDrama.getImageUrl());
        chineseDramaRepository.save(chineseDramaToUpdate);

    }
}
