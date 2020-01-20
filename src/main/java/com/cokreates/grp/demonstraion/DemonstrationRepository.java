package com.cokreates.grp.demonstraion;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemonstrationRepository extends PagingAndSortingRepository<Demonstration, String> {

    public List<Demonstration> findBySessionName(String sessionName);
}
