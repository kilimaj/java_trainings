package dev.kilima.library.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.kilima.library.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
	@Query(value = "select bk from Book bk where bk.title like %?1%")
	List<Book> findByTitle(String title);
	@Query(value = "select bk.title, bk.author from Book bk where bk.bookId=?1")
	Optional<Book> getTitleAuthorById(int id);
}
