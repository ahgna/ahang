/**
 * fshows.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package demo.api.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author ahgna
 * @version TestAPi.java, v 0.1 2024-05-28 14:59 ahgna
 */

@RestController
@RequestMapping("/test")
public class TestAPi {

    @PostMapping("/more/test")
    public void doMoreTest(@RequestBody HashMap<String, String> param) {
        System.out.println(param);

    }
}
