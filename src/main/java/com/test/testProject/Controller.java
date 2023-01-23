package com.test.testProject;

import com.test.testProject.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("hello/{name}")
    public String  hello(@PathVariable String name) {
        return "Dobrodosao " + name;
    }
}
