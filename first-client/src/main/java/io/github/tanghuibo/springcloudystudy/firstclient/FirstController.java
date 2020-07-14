package io.github.tanghuibo.springcloudystudy.firstclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:12
 */
@RestController
@RequestMapping("first")
public class FirstController {

    @GetMapping("test")
    public String test() {
        return "hello first";
    }
}
