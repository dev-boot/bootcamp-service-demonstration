package com.cokreates.grp.demonstraion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demonstration")
public class DemonstrationRestController {

    private DemonstrationService demonstrationService;

    @Autowired
    DemonstrationRestController(DemonstrationService demonstrationService){
        this.demonstrationService = demonstrationService;
    }

    @PostMapping("/get-by-name")
    public ResponseEntity<List<Demonstration>> getByName(Demonstration dto) {
        return ResponseEntity.ok(demonstrationService.doSomething(dto.getSessionName()));
    }


}
