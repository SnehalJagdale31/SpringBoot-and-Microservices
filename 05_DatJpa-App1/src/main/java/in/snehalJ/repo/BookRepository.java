package in.snehalJ.repo;

import org.springframework.data.repository.CrudRepository;

import in.snehalJ.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

}
