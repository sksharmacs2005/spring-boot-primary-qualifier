package com.primary.qualifier.controller;

import com.primary.qualifier.inter.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
    @Autowired
    @Qualifier("beta")
    private University university;
    @GetMapping("/college")
    public String getCollege()
    {
        return university.display();
    }
}
