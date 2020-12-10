package technology.mgm.care.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technology.mgm.care.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
