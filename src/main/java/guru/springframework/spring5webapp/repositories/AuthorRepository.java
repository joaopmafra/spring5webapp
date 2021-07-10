package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by João Paulo Mafra on 10/07/2021.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.custom-implementations

}
