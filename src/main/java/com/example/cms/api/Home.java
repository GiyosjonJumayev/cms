package com.example.cms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Smart on 24.06.2020.
 */

@RestController
public class Home {

    @GetMapping
    public String Home() {
        return "Application works!!!" + new Date();
    }
}
