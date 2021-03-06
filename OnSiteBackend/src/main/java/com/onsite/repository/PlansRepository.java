package com.onsite.repository;

import com.onsite.model.DesignPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by TJR on 3/9/2017.
 */
public interface PlansRepository extends JpaRepository<DesignPlan,Integer> {
    List<DesignPlan> findByProjectProjectId(Integer projectId);
}
