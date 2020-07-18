package io.github.tanghuibo.springcloudystudy.secondimpl.controller;

import io.github.tanghuibo.springcloudystudy.firstclient.api.FirstClient;
import io.github.tanghuibo.springcloudystudy.second.client.SecondClient;
import io.github.tanghuibo.springcloudystudy.secondimpl.client.impl.BadFirstClientImpl;
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
    FirstClient firstClient;

    @Resource
    BadFirstClientImpl badFirstClient;

    @Override
    public String sayHello(String username) {
        return String.format("hello %s, I am second client", username);
    }

    @GetMapping("testFeignClient")
    public String testFeignClient(@RequestParam String username) {
        return String.format("from feign: %s", firstClient.sayHello(username));
    }

    @GetMapping("testFeignClientTimeout")
    public String testFeignClientTimeout(@RequestParam("millis") Integer millis) {
        return String.format("from feign: %s", badFirstClient.timeout(millis));
    }

    @GetMapping("timeout")
    public String timeout(@RequestParam("millis") Integer millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout";
    }

}