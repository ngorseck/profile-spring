package com.sopra.frofiles.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customers")
@Slf4j
public class CustomerController {


    @Value("${java.home}")
    private String javaHome;


    @GetMapping("/")
    public String home(Model model) {

        /**
         *  INFO -INFO is the default logging level that is set by Spring Boot.
         *  If no configurations are made, the log level
         *  is automatically set to INFO
         */
        //log.info("JavaHome = " + javaHome);

        /**
         * you must set level in application.properties file to DEBUG
         * You can see the right confirgutaion to be set
         */
        log.debug("JavaHome = " + javaHome);

        model.addAttribute("javaHome", javaHome);

        return "home";
    }
}
