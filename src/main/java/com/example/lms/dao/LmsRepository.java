package com.example.lms.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.lms.models.Book;

@Repository
public interface LmsRepository extends CrudRepository<Book, Long>{

}
