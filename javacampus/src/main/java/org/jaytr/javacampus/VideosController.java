package org.jaytr.javacampus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideosController {

    @RequestMapping(value = "/videos")
    public String index() {
        return "Videos 리스트";
    }
    
}
