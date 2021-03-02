package com.hc.hellocode.controller;


import com.hc.hellocode.entity.CollegeInfor;
import com.hc.hellocode.repository.CollegeInforRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/college")
public class CollegeInforController {
    @Autowired
    private CollegeInforRepository collegeInforRepository;

    @GetMapping("/findAll")
    public List<CollegeInfor> findAll(){
        return collegeInforRepository.findAll();
    }
}
