package lab1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import lab1.domain.Player;

/**
 * Created by david on 1/9/16.
 */
@RestResource(path = "players", rel="players")
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
