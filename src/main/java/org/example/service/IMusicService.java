package org.example.service;



import org.example.model.Music;

import java.util.List;

public interface IMusicService {

    List<Music> findAll();

    Music findById(int id);

    void save(Music music);

    void update(int id, Music music);

    void remove(int id);

    List<Music> findByName(String name);
}
