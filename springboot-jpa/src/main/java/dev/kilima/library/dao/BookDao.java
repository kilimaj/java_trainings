package dev.kilima.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.kilima.library.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
