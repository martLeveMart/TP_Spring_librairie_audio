package com.myAudioLibrairie.apirest.repository;

import com.myAudioLibrairie.apirest.model.Album;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlbumRepository extends PagingAndSortingRepository<Album, Integer> {

    Album findById(Integer id);

    Album findByTitle(String title);
}
