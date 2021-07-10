package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by João Paulo Mafra on 10/07/2021.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
