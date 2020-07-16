package io.github.tanghuibo.springcloudystudy.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:12
 */
@RestController
@RequestMapping("second")
public class SecondController {

    @GetMapping("test")
    public String test() {
        return "hello second";
    }
}
