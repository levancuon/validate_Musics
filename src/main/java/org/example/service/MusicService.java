package org.example.service;


import org.example.model.Music;
import org.example.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService{

    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return (List<Music>) musicRepository.findAll();
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void update(int id, Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public List<Music> findByName(String name) {
        return musicRepository.findByName(name);
    }
}