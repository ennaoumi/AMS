package com.ennaoumi.ams.services.impl;

import com.ennaoumi.ams.entities.Planning;
import com.ennaoumi.ams.repositories.PlanningRepository;
import com.ennaoumi.ams.services.IPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanningServiceImpl implements IPlanningService {
    @Autowired
    private PlanningRepository planningRepository;
    @Override
    public Planning save(Planning planning) {
        return planningRepository.save(planning);
    }

}
