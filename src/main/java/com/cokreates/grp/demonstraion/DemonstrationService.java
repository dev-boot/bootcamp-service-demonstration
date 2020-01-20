package com.cokreates.grp.demonstraion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemonstrationService {

    private DemonstrationRepository demonstrationRepository;

    @Autowired
    DemonstrationService(DemonstrationRepository demonstrationRepository){
        this.demonstrationRepository = demonstrationRepository;
    }

    public List<Demonstration> doSomething(String sessionName) {
        return demonstrationRepository.findBySessionName(sessionName);
//        return new ArrayList<>();
    }
}
