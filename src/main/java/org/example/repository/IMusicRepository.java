package org.example.repository;



import org.example.model.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IMusicRepository extends PagingAndSortingRepository<Music,Integer>, CrudRepository<Music,Integer> {


    List<Music> findByName(String name);
}
