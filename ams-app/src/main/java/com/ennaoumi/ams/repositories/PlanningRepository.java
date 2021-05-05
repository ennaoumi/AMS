package com.ennaoumi.ams.repositories;

import com.ennaoumi.ams.entities.Planning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanningRepository extends JpaRepository<Planning,Long> {

}
