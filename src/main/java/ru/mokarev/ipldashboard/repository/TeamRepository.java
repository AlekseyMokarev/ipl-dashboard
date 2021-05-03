package ru.mokarev.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mokarev.ipldashboard.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByTeamName(String teamName);
}
