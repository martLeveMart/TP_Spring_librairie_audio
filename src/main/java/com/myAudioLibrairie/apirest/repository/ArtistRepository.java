package com.myAudioLibrairie.apirest.repository;

import com.myAudioLibrairie.apirest.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Integer> {

    Artist findByName(String name);

    Artist findById(Integer id);

    Page<Artist> findByNameStartsWith(String name, Pageable pageable);
}
