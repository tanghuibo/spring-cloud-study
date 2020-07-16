package io.github.tanghuibo.springcloudystudy.secondimpl.controller;

import io.github.tanghuibo.springcloudystudy.second.client.SecondClient;
import io.github.tanghuibo.springcloudystudy.secondimpl.client.impl.FirstClientImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2020/7/14下午11:12
 */
@RestController
public class SecondController implements SecondClient {

    @Resource
    FirstClientImpl firstClient;

    @Override
    public String sayHello(String username) {
        return String.format("hello %s, I am second client", username);
    }

    @GetMapping("testFeignClient")
    public String testFeignClient(@RequestParam String username) {
        return String.format("from feign: %s", firstClient.sayHello(username));
    }
}