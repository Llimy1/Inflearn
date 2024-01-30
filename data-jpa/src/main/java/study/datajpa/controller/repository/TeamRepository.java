package study.datajpa.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.controller.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
