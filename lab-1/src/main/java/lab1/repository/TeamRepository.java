package lab1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import lab1.domain.Team;

/**
 * Created by david on 1/9/16.
 */
@RestResource(path="teams", rel="teams")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
