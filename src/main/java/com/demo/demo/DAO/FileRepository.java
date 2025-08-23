package com.demo.demo.DAO;

import com.demo.demo.model.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileRepository extends MongoRepository<File,String> {
    Optional<File> findByFilename(String filename);

    boolean existsByFilename(String filename);

   /* @Query("{'filename': ?0}")
    Optional<File> getfileByFilename(String filename);

    @Query(value = "{'filename': ?0}", exists = true)
    boolean existsByname(String filename);

    @Query("{'size': {$gte: ?0,$lte: ?1}}")
    List<File> findfilesinsizerange(Long minsize, Long maxsize);
    @Query(value="{'filename': ?0}", delete=true)
    void deleteByFilename(String filename);*/
}
