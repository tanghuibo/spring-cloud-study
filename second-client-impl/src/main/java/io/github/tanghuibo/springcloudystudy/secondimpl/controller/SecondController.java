package io.github.tanghuibo.springcloudystudy.secondimpl.controller;

import io.github.tanghuibo.springcloudystudy.second.client.SecondClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:12
 */
@RestController
public class SecondController implements SecondClient {

    @Override
    public String sayHello(String username) {
        return String.format("hello %s, I am second client", username);
    }
}